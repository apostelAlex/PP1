// Alexandros Apostolidis

class Fluss {
    public int laenge;
    public String name;
    public String kontinent;
    public String quellgebiet;
    public String muendung;

    /* *** Aufgabe 3a *** */
    /* Konstruktor mit Parametern fuer alle Attribute */
    // 1
    public Fluss(int laenge, String name, String kontinent, String quellgebiet, String muendung){
        this.laenge = laenge;
        this.name = name;
        this.kontinent = kontinent;
        this.quellgebiet = quellgebiet;
        this.muendung = muendung;
    }

    /* Methode gibt true zurueck, wenn der Fluss auf dem Kontinent
       ist, der durch den String k spezifiziert wird, ansonsten
       false
    */
    public boolean aufKontinent(String k) {
        return kontinent.equals(k);
    }

    /* *** Aufgabe 3b *** */
    /* Methode gibt zunaechst k Leerzeichen aus und dann 
       Namen und Laenge (in Klammern) des Flusses  
    */
    // 1
    public String toString(int n){
       String result = "";
       for (int i = 0; i < n; i++) {
            result += " ";
       }
       return result + this.name + " (" + this.laenge + ")";
    }
    
}


public class Fluesse {
    static Fluss[] fluesse = new Fluss[Data.flussDaten.length];
    
    public static void main(String[] args) {
        /* *** Aufgabe 3c *** */
        // 2
        
        for (int i = 0; i < fluesse.length; i++) {
            String[] fluss = Data.flussDaten[i];
            fluesse[i] = new Fluss(Data.toInt(fluss[0]), fluss[1], fluss[2], fluss[3], fluss[4]);
        }
        

        /* *** Aufgabe 3d *** */
        // 3
        String[] kontinente = {"Afrika", "Asien", "Australien", "Europa", "Nordamerika", "Südamerika"};
        for (int i = 0; i < kontinente.length; i++) {
            System.out.println(kontinente[i]+":");
            int temp = 0;
            for (int j = 0; i < fluesse.length && temp < 3; j++) {
                if (fluesse[j].kontinent.equals(kontinente[i])) {
                    System.out.println(fluesse[j].toString(4));
                    temp++;
                }
            }
        }{
            
        }
    }
}
