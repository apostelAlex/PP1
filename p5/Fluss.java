// Alexandros Apostolidis
class Fluss {
    public int laenge;
    public String name;
    public String kontinent;
    public String quellgebiet;
    public String muendung;

    /* Konstruktor mit Parametern fuer alle Attribute */
    public Fluss(int km, String n, String k, String q, String m) {
        laenge = km;
        name = n;
        kontinent = k;
        quellgebiet = q;
        muendung = m;
    }

    /* Methode gibt true zurueck, wenn der Fluss auf dem Kontinent
       ist, der durch den String k spezifiziert wird, ansonsten
       false
    */
    public boolean aufKontinent(String k) {
        return kontinent.equals(k);
    }

    public boolean muendetIn (String m) {
        return muendung.equals(m);
    }


    /* Methode gibt einen String mit
       Namen und Laenge (in Klammern) des Flusses  
       sowie Quellgebiet und Mündung aus.
    */
    public String toString(){     
        return name + " (" + laenge + " km)" +
            "\n    Quellgebiet: " + quellgebiet +
            "\n    Mündung:     " + muendung + "\n";
    }
}


