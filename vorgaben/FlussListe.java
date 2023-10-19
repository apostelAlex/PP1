
class FlussListenelement {
    Fluss data;
    FlussListenelement next;
}


public class FlussListe {	
    FlussListenelement head;
    FlussListenelement z;
	
    // leere Liste erzeugen
    public FlussListe(){
        head = new FlussListenelement();
        z = new FlussListenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }
	
    // Ausgabe aller Elemente der Liste
    public void printListe(){
        int count = 1;
        FlussListenelement ele = head.next;
        while (ele != z){
            System.out.println(count++ + ". " + ele.data);
            ele = ele.next;
        }
        System.out.println();
    }
    
    // neues Element mit dem als Parameter übergebenen Daten-Objekt 
    // am Kopf der Liste einfügen
    public void insert(Fluss fluss){
        FlussListenelement newEle = new FlussListenelement();
        newEle.data = fluss; // nur Referenzkopie
        newEle.next = head.next;
        head.next = newEle;
    }

    /* *** Aufgabe 3a *** */
    // filtert alle Fluesse mit einer bestimmten Muendung aus
    // der Liste und speichert sie in einer Ergebnisliste,
    // die am Ende zurueckgegeben wird
    // Hinweis: Vergleichen Sie zwei String-Werte s1 und s2 auf
    //          Gleichheit mit der Instanzmethode equals:
    //          s1.equals(s2)
    // 3P
    public FlussListe filterNachMuendung(String muendung) {
        FlussListe fListe = new FlussListe();
        FlussListenelement fl = this.head;
        while (fl.next != this.z){
            fl = fl.next;
            if (fl.data.muendung.equals(muendung)){
                fListe.insert(fl.data);
            }
        }
        
        return fListe;
    }

     /* *** Aufgabe 3d *** */
    // Die Methode generiert eine StringListe, die alle 
    // Muendungen beinhaltet, die in einem der Fluesse
    // der aktuellen Flussliste vorkommen
    // 2P
    public StringListe getMuendungen() {
        StringListe mListe = new StringListe();
        FlussListenelement temp = this.head;
        while (temp.next != z) {
            temp = temp.next;
            System.out.println(temp.data.toString());

            mListe.insertNoDuplicates(temp.data.muendung);
            
        }

        return mListe;
    }
 
}
