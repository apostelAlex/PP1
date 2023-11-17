// Alexandros Apostolidis
import javax.swing.*;
import java.awt.*;


public class MyMemory extends JFrame {
    private final static int anzZeilen = 4, anzSpalten = 6;
    private Karte [][] kartenFeld = new Karte[anzZeilen][anzSpalten];
    private ZaehlerLabel zaehlerVersuche, zaehlerPaare;
    Container c;
    KartenButton[] buttons = new KartenButton[anzSpalten*anzZeilen];
    public MyMemory(){
        c = this.getContentPane();
        c.setLayout(new BorderLayout());
        Container boxes = new Container();
        boxes.setLayout(new GridLayout(anzZeilen, anzSpalten));
        int zeile = -1;
        for (int i = 0; i < buttons.length; i++) {
            if (i%6 == 0) {
                zeile++;
            }
            buttons[i] = new KartenButton(kartenFeld[zeile][i%6]);
            boxes.add(buttons[i]);
        }
        c.add(boxes, BorderLayout.CENTER);

        JPanel zaehler = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 0));
        
        Font zaehlerFont = new Font(getName(), Font.PLAIN, 20);


        JPanel versuche = new JPanel(new FlowLayout());
        JPanel paare = new JPanel(new FlowLayout());

        JLabel vLabel = new JLabel("Anzahl Versuche:");
        vLabel.setFont(zaehlerFont);
        versuche.add(vLabel);

        zaehlerVersuche = new ZaehlerLabel();
        zaehlerVersuche.setFont(zaehlerFont);
        versuche.add(zaehlerVersuche);

        versuche.setBackground(new Color(0x9ACD32));

        JLabel pLabel = new JLabel("Anzahl Paare");
        pLabel.setFont(zaehlerFont);
        paare.add(pLabel);

        zaehlerPaare = new ZaehlerLabel();
        zaehlerPaare.setFont(zaehlerFont);
        paare.add(zaehlerPaare);
        paare.setBackground(new Color(0x9ACD32));


        zaehler.add(versuche);
        zaehler.add(paare);
        zaehler.setBackground(new Color(0x9ACD32));

        zaehler.setBorder(BorderFactory.createLineBorder(Color.black));


        c.add(zaehler, BorderLayout.SOUTH);

       
        // initialisiert zufaellige Verteilung der Karten im KartenFeld
	Resources.initFeld(kartenFeld); 

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.pack();
	this.setVisible(true);
    }


    public static void main(String[] args){
	MyMemory mm = new MyMemory();
    }
}
