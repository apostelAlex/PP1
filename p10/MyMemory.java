// Alexandros Apostolidis
import javax.swing.*;
import java.awt.*;

public class MyMemory extends JFrame {
    private static final Color bg = Color.white;
    private static final Color bg2 = new Color(126,192,238);
    private final static Font f = new Font("Arial",Font.BOLD,20);
    private final static int anzZeilen = 4, anzSpalten = 6;
    // zweidim. Feld mit allen Karten
    private Karte [][] kartenFeld = new Karte[anzZeilen][anzSpalten];
    // Panel, dem diese KaretnButtons zeilen- und spaltenweise
    // zugeordnet wurden.
    private JPanel buttonPanel;
    // Labels, um die Anzahl der Versuche bzw. der erkannten Paare
    // anzuzeigen
    private ZaehlerLabel zaehlerVersuche, zaehlerPaare;

    public MyMemory() {
	Resources.initFeld(kartenFeld); // init. zufaellige Verteilung der Karten
	createComponents();
        createListener();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.pack();
	this.setVisible(true);
    }
  
    private void createComponents(){
	// Panel mit Zaehler für Versuche 
	JPanel p2 = new JPanel();
	p2.setBackground(bg2);

	JLabel text1 = new JLabel("Anzahl Versuche: ");
	JLabel text2 = new JLabel("Anzahl Paare: ");
	zaehlerVersuche = new ZaehlerLabel();
	zaehlerPaare = new ZaehlerLabel();
	for (JLabel l : new JLabel[] {text1, zaehlerVersuche, 
				      text2, zaehlerPaare}){
	    l.setFont(f);
	}
	JPanel pl1 = new JPanel();
	pl1.setBackground(bg2);
	pl1.add(text1);pl1.add(zaehlerVersuche);	
	JPanel pl2 = new JPanel();
	pl2.setBackground(bg2);
	pl2.add(text2);pl2.add(zaehlerPaare);
	p2.add(pl1); 
	p2.add(Box.createHorizontalStrut(50));
	p2.add(pl2);
	p2.setBorder(BorderFactory.createLineBorder(Color.black,1));
	this.getContentPane().add(p2,BorderLayout.SOUTH);

	// Panel mit Karten-Buttons
	this.buttonPanel = new JPanel();
	this.buttonPanel.setLayout(new GridLayout(anzZeilen,anzSpalten));
	this.buttonPanel.setBackground(bg);
	for (Karte[] kFeld : kartenFeld){
	    for (Karte k : kFeld){
		KartenButton b = new KartenButton(k);
		this.buttonPanel.add(b);
	    }
	}
	this.getContentPane().add(this.buttonPanel,BorderLayout.CENTER);

    }

    /* *** Aufgabe 1:  Listener generieren und registrieren *** */
    private void createListener() {
        Component[] buttons = buttonPanel.getComponents();
		KartenListener kl = new KartenListener(zaehlerVersuche, zaehlerPaare);
        for (Component comp : buttons) {
			// Check if the component is an instance of KartenButton
			if (comp instanceof KartenButton) {
				// Cast the component to KartenButton
				KartenButton button = (KartenButton) comp;
	
				// Add the listener to the button
				button.addActionListener(kl);
			}
		}
         
    }

    public static void main(String[] args){
	MyMemory mm = new MyMemory();
    }
}
