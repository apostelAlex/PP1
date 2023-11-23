// Alexandros Apostolidis
public class Terminliste{
    private Termin[] termine;
    private int extend;     // Anzahl der Elemente, um die das Feld termine
                            // bei Bedarf vergrößert wird 
    private int currentIndex = -1;

    /* leere Terminliste anlegen mit (initial) Platz fuer 5 Termine */
    public Terminliste(){
	this(5);
    }

    /* leere Terminliste anlegen mit (initial) Platz fuer extend Termine */
    public Terminliste(int extend){
	this.extend = extend;
	termine = new Termin[extend];
    }

    /* gibt den Termin an Position i zurueck: i = 1,2,3, ... 
       Fuer einen ungueltigen Wert (i <= 0) oder i >= Laenge des Felds termine
       wird null zurueckgegeben
     */  
    public Termin getTermin(int i){
	return ((i > 0) && (i <= termine.length)) ? termine[i-1] : null;
    }

    /* gibt die aktuelle Anzahl in der Liste eingetragener Termine zurueck */
    public int getAnzahlTermine() {
        return currentIndex+1;
    }

    private void extendTerminArray(){
  	Termin[] newTermine = new Termin[termine.length + extend];
	for (int i=0;i<termine.length;i++){
	    newTermine[i] = termine[i];
	}
	termine = newTermine;
    }

    
    /* Termin hinzufuegen: Falls Array voll, wird dieses zunaechst erweitert */
    public void addTermin(Termin t){
    	if ((currentIndex+1) >= termine.length){
    	    extendTerminArray();
    	}
    	termine[++currentIndex] = t;
    }	


    /* Sortiert Array mit Terminen aufsteigend nach Datum */
    public void sortTermine(){
	if (currentIndex >= 1) {
	    java.util.Arrays.sort(termine,0,currentIndex+1);
	}
    }


}
