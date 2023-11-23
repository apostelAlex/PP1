// Alexandros Apostolidis
import java.awt.event.*;


public class KartenListener implements ActionListener{
    private ZaehlerLabel zaehlerVersuche;
    private ZaehlerLabel zaehlerPaare;
    
    private int count = 0;
    private KartenButton[] buttons = new KartenButton[2];

    public KartenListener (ZaehlerLabel zaehlerVersuche, 
			   ZaehlerLabel zaehlerPaare){
	this.zaehlerVersuche = zaehlerVersuche;
	this.zaehlerPaare = zaehlerPaare;
    }

    // *** Aufgabe (1): Listener implementieren ***
    public void actionPerformed(ActionEvent e){
        if (count < 2){
            buttons[count] = (KartenButton) e.getSource();
            buttons[count].setEnabled(false);
            buttons[count].setSelected(true);
            count++;
        }
        else{      
            count = 0;
            zaehlerVersuche.increase(1);
            if (buttons[0].istPaar(buttons[1])) {
                for (KartenButton bt : buttons) {
                    bt.entferneKarte();
                }
                zaehlerPaare.increase(1);
            }
            else {
                for (KartenButton bt : buttons) {
                    bt.setEnabled(true);
                    bt.setSelected(false);
                }
            }
            buttons[count] = (KartenButton) e.getSource();
            buttons[count].setEnabled(false);
            buttons[count].setSelected(true);
            count++;
        }

    }
}
