// Alexandros Apostolidis
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;


public class TerminListe extends JFrame {
    static final long serialVersionUID = 1L;

    /* Farben und Fonts */
    Color color_1, color_2;
    Font font_1, font_2;


    /* Komponenten, mit denen spaeter interagiert wird */
    private JComboBox<String> tage, monate, jahre, stunden, minuten; 
    private JTextField tf;
    private JTextArea textArea;
    private JButton button1, button2; 


    public TerminListe(){
	super("Terminkalender");
        this.setSize(new Dimension(400,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();    // Oberflaeche zusammenbausen
        this.pack();
        this.setVisible(true);
    }

    /* Komponenten erstellen */
    private void init(){
        color_1 = Color.CYAN;

        Container c = this.getContentPane();
        Container northPanel = new Container();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
        JPanel datumJPanel = new JPanel(new FlowLayout());
        datumJPanel.setBackground(color_1);
        JPanel uhrzeitPanel = new JPanel(new FlowLayout());
        uhrzeitPanel.setBackground(color_1);
        
        /* **************************************************** */
        JLabel datumLabel = new JLabel("Datum:    ");
        font_1 = new Font("Arial", Font.PLAIN, 15);
        datumLabel.setFont(font_1);
        datumJPanel.add(datumLabel);
        String[] datumStrings = new String[31];
        for (int i = 0; i < datumStrings.length; i++) {
            datumStrings[i] = String.valueOf(i+1);
        }

        tage = new JComboBox<String>(datumStrings);
        tage.setFont(font_1);
        datumJPanel.add(tage);
        String[] monateStrings = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "Septamber", "Oktober", "November", "Dezember"};
        monate = new JComboBox<String>(monateStrings);
        monate.setFont(font_1);
        datumJPanel.add(monate);
        String[] jahreStrings = {"2023", "2024", "2025"};
        jahre = new JComboBox<String>(jahreStrings);
        jahre.setFont(font_1);
        datumJPanel.add(jahre);

        JLabel uhrLabel = new JLabel("Uhrzeit:   ");
        uhrLabel.setFont(font_1);
        uhrzeitPanel.add(uhrLabel);
        String[] studnenStr = new String[24];
        DecimalFormat df = new DecimalFormat("00");
        for (int i = 0; i < studnenStr.length; i++) {
            studnenStr[i] = df.format(i+1);
        }
        stunden = new JComboBox<String>(studnenStr);
        stunden.setFont(font_1);
        uhrzeitPanel.add(stunden);

        String[] minutenStr = new String[60];
        for (int i = 0; i < minutenStr.length; i++) {
            minutenStr[i] = df.format(i+1);
        }
        minuten = new JComboBox<>(minutenStr);
        minuten.setFont(font_1);
        uhrzeitPanel.add(minuten);

        northPanel.add(datumJPanel);
        northPanel.add(uhrzeitPanel);

        JPanel inhaltPanel =  new JPanel();


        JLabel inhaltLabel = new JLabel("Inhalt:     ");
        inhaltPanel.add(inhaltLabel);
        tf = new JTextField("                                          ");
        inhaltPanel.add(tf);
        northPanel.add(inhaltPanel);
        northPanel.setBackground(color_1);

        c.add(northPanel, BorderLayout.NORTH);


        /* ******************************************** */
        Container buttonPanel = new Container();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        button1 = new JButton("Termin anlegen");
        button2 = new JButton("Alle Termine anzeigen");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        c.add(buttonPanel, BorderLayout.CENTER);


        /*********************************** */
        textArea = new JTextArea(5,20);
        textArea.setText("Termine:");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        color_2 = Color.GREEN;
        textArea.setBackground(color_2);
        c.add(textArea, BorderLayout.SOUTH);
	
    }

    public static void main(String[] args){
	TerminListe liste = new TerminListe();
	liste.setVisible(true);
    }
}
