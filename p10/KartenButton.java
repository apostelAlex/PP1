// Alexandros Apostolidis
import javax.swing.JToggleButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class KartenButton extends JToggleButton {
    private static Color bgk = new Color(176,226,255);
    private Karte karte;
    private boolean karteEntfernt = false;
    
    public KartenButton(Karte k){
	this.karte = k;
	this.setPreferredSize(new Dimension(100,100));
    }
  

    // ermittelt, ob dieser Button und der Button b2
    // das gleiche Bild beinhalten (also die gleiche Karte zeigen)
    // geht ueber Referenzvergleich, da sich je zwei Buttons
    // eine Karte teilen (es referenzieren)
    public boolean istPaar(KartenButton b2){
	return this.karte == b2.karte;
    }


    // Button deaktivieren (nicht mehr clickbar)
    public void entferneKarte(){
	this.karteEntfernt = true;
	this.setEnabled(false);
	this.repaint();
    }
    
    // je nach Zustand (aufgedeckt oder nicht) Vorder oder
    // Rueckseite der Karte zeichnen
    public void paint(Graphics g){
	int w = this.getWidth();
	int h = this.getHeight();
	int d = 5;
	if (!this.karteEntfernt){ // falls Karte noch nicht entfernt
	    if (this.isSelected()){
		// Bild wird skaliert auf Buttongroesse abzueglich Rand
		int wi = w-2*d;
		int hi = h-2*d; 
		Image img = this.karte.getImage(); 
		// Bild skalieren und zeichnen
		g.drawImage(img,d,d,wi,hi,Color.white,this);
		g.setColor(Color.black);
		g.drawRect(d,d ,w-2*d, h-2*d);
	    } else {
		g.setColor(bgk);
		g.fillRect(d,d ,w-2*d, h-2*d);
		g.setColor(Color.black);
		g.drawRect(d,d ,w-2*d, h-2*d);
	    }
	} else { // falls Karte entfernt
	    g.setColor(Color.white);
	    g.fillRect(0,0,w,h); // Bereich loeschen
	} 
    }
}
