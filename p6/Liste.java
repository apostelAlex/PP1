class Listenelement {
    protected Teilnehmer data;
    protected Listenelement next;

    // Default Konstruktor
    public Listenelement(){
    }

    // Konstruktor, der Teilnehmer initialisiert 
    // Referenzkopie des Teilnehmers
    public Listenelement(Teilnehmer t){
	this.data = t;
    }
}

public class Liste {
	
    Listenelement head;
    Listenelement z;
	
    // leere Liste erzeugen
    public Liste(){
        head = new Listenelement();
        z = new Listenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }
	
    // Ausgabe aller Elemente der Liste
    public void print(){
        int count = 1;
        Listenelement ele = head.next;
        while (ele != z){
            System.out.print(count++ + ". ");
            System.out.println(ele.data);
            ele = ele.next;
        }
        System.out.println();
    }
    
  
    // neues Element mit dem als Parameter übergebenen Daten-Objekt 
    // am Kopf der Liste einfügen
    public void insert(Teilnehmer dataEle){
        Listenelement newEle = new Listenelement();
        newEle.data = dataEle; // nur Referenzkopie
        newEle.next = head.next;
        head.next = newEle;
    }
}
