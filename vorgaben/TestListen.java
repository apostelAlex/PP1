public class TestListen {
    public static void main(String[] args) {
        Fluss[] flussFeld = FlussDaten.createFlussFeld();
        FlussListe fListe = new FlussListe();

        for (Fluss f : flussFeld) {
            fListe.insert(f);
        }
        
        /* *** Aufgabe 3e *** */
        // 1P
        // Liste mit Muendungen initialisieren und ausgeben
        StringListe mListe = fListe.getMuendungen();
        mListe.printListe();
        
        String muendung = IOTools.readLine("Mündung: ");
        while(mListe.contains(muendung)){
            FlussListe fl = fListe.filterNachMuendung(muendung);
            fl.printListe();
            muendung = IOTools.readLine("Mündung: ");
        }
        // Muendungen einlesen und jeweils alle Fluesse dazu ausgeben
        
        
        
        
    }
}
