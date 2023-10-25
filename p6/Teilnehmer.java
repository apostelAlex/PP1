class Teilnehmer {
    private static int count = 0;
    private int startNr;   // eindeutige Startnummer
    private String name;   // Name des Teilnehmers (Vor + Nachname)
    private int zeit;      // im Wettkampf gelaufene Zeit (in Sekunden)
    private int jahrgang;  // Geburtsjahr des Teilnehmers


    public Teilnehmer(String name, int zeit, int jahrgang){
	startNr = ++count;
	this.name = name;
	this.zeit = zeit;
	this.jahrgang = jahrgang;
    }


    // String-Repraesentation fuer die Ausgabe eines Teilnehmers
    // name + (Startnr / Jahrgang) formatierte Zeit
    public String toString(){
	int min = this.zeit/60;
	int sek = this.zeit%60;
	return this.name + " (" + this.startNr + "/" + this.jahrgang + ") " +
	    min + ":" + ((sek < 10) ? ("0" + sek) : sek);
    }

    /* *** Aufgabe 2a *** */
    public int compareTo(Teilnehmer t) {
        return this.zeit - t.zeit;
    }
    

    public int getKey(){
	return this.jahrgang;
    }

}

class SortierteListe extends Liste {
    public void insert(Teilnehmer t) {
        Listenelement n = new Listenelement(t);
        // Einfügen in der Mitte
        Listenelement temp = head;
        while (temp.next != z ){
            if (t.compareTo(temp.next.data)<0 ){
                n.next = temp.next;
                temp.next = n;
                return;
            }
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }
}