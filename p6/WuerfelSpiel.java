// 2
class Wuerfel {
    private static int count = 0;
    private int wert = 1;
    private int nr;

    /* *** Aufgabe 1a *** */
    public Wuerfel(){        
        nr = ++count;
    }

    public int getWert(){
        return wert;
    }

    public void wuerfeln(){
        wert = (int) Math.round(Math.random()*5) + 1;
    }

    public String toString(){
        return " W"+nr+ " = " + wert;
    }
}

// 2
class Punkte {
    private int anzahl;

    /* *** Aufgabe 1b *** */
    public int getAnzahl(){
        return anzahl;
    }

    public void update(int n){
        anzahl += n;
        if (anzahl < 0) 
            anzahl = 0;
    }

    public String toString(){
        return " "+ anzahl + " Punkte";
    }

    
}

// 3
class Spieler {
    private static int count = 0;
    private String name;
    private Punkte punkte;

    /* *** Aufgabe 1c *** */
    public Spieler(){
        name = "Spieler-"+ ++count;
        punkte = new Punkte();
    }

    public String getName(){
        return name;
    }

    public String getErgebnis(){
        return name + " hat " + punkte.getAnzahl() + " Punkte";
    }

    public int compareTo(Spieler s){
        return punkte.getAnzahl() - s.punkte.getAnzahl();
    }

    public void wuerfeln(Wuerfel[] ww){
        for (Wuerfel wuerfel : ww) {
            wuerfel.wuerfeln();
            punkte.update(wuerfel.getWert());
        }
    }
}

// 5
public class WuerfelSpiel {
    private static int anzahlRunden = 5;
    private static int anzahlWuerfel = 3;
    
    private Wuerfel[] wuerfel;
    private Spieler sp1, sp2;

    



    public void ausgabeErgebnis() {

        System.out.println(sp1.getErgebnis());
        System.out.println(sp2.getErgebnis());
        if (sp1.compareTo(sp2) > 0) {
            System.out.println("Spieler 1 hat gewonnen");
        } else if (sp1.compareTo(sp2) < 0) {
            System.out.println("Spieler 2 hat gewonnen");
        } else {
            System.out.println("Unentschieden");
        }

    }

    /* *** Aufgabe 1d *** */

    public WuerfelSpiel(){
        sp1 = new Spieler();
        sp2 = new Spieler();
        wuerfel = new Wuerfel[anzahlWuerfel];
        for (int i = 0; i < wuerfel.length; i++) {
            wuerfel[i] = new Wuerfel();
        }
    }

    public String ausgabeWurf(Wuerfel[] ww){
        String res = "";
        for (Wuerfel w : ww) {
            res += w.toString();
        }
        return res;
    }
  
    public void spielen() {
        for (int i = 0; i < anzahlRunden; i++) {
            sp1.wuerfeln(wuerfel);
            System.out.println("Wurf Spieler 1:" + ausgabeWurf(wuerfel));
            sp2.wuerfeln(wuerfel);
            System.out.println("Wurf Spieler 2:" + ausgabeWurf(wuerfel));
            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        WuerfelSpiel wSpiel =  new WuerfelSpiel();
        wSpiel.spielen();
        wSpiel.ausgabeErgebnis();

    }
}
