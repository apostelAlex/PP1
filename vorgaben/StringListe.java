
class StringListenelement {
    String data;
    StringListenelement next;
}


public class StringListe {	
    StringListenelement head;
    StringListenelement z;
	
    // leere Liste erzeugen
    public StringListe(){
        head = new StringListenelement();
        z = new StringListenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }
	
    // Ausgabe aller Elemente der Liste
    public void printListe(){
        int count = 1;
        StringListenelement ele = head.next;
        while (ele != z){
            System.out.println(count++ + ". " + ele.data);
            ele = ele.next;
        }
        System.out.println();
    }

    

    /* *** Aufgabe 3b *** */
    // Die Methode gibt den Wert true zurueck, wenn
    // die Liste den String s enthaelt und ansonsten
    // den Wert false
    // Hinweis: Vergleichen Sie zwei String-Werte s1 und s2 auf
    //          Gleichheit mit der Instanzmethode equals:
    //          s1.equals(s2)
    // 2P
    public boolean contains(String s) {
        StringListenelement temp = head;
        while (temp.next != temp){
            if (s.equals(temp.data)){
                return true;
            }
        }
        return false;  
    }

    /* *** Aufgabe 3c *** */
    // neues Element mit dem als Parameter übergebenen Daten-Objekt 
    // am Ende der Liste einfügen, sofern das Element noch nicht
    // in der Liste gespeichert ist
    // 2P
    public void insertNoDuplicates(String str){
        StringListenelement temp = head;
        while (temp.next != this.z){
            if (temp.data.equals(str)){
                return;
            }
            temp = temp.next;
        }
        StringListenelement n = new StringListenelement();
        n.data = str;
        temp.next = n;
        n.next = z;
    }
}
