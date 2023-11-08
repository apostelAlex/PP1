package p08.types;

import p08.data.Element;

public class List  {
    private Listenelement head,z;
    private int count = 0;  // Zaehler fuer Anzahl der Elemente in der Liste

    private class Listenelement{
	Element data;
	Listenelement next;

	public Listenelement(){
	}

 	public Listenelement(Element data){
	    this.data = data;
	}
   }

    // generiert leere Liste
    public List(){
	head = new Listenelement();
	z = new Listenelement();
	head.next = z;
	z.next = z;
    }

    // neues Element mit dem als ersten Parameter übergebenen Daten-Objekt 
    // nach dem als zweiten Parameter übergebenen Element einfügen
    private void insert(Element dataEle, Listenelement anchor){
	Listenelement newEle = new Listenelement();
	newEle.data = dataEle; // nur Referenzkopie
	newEle.next = anchor.next;
	anchor.next = newEle;
	count++;
    }

    // neues Element mit dem als ersten Parameter übergebenen Daten-Objekt
    // an k. Stelle einfügen (k = 1 >= am Kopf der Liste)
    protected void insertElementAt(Element dataEle, int k){
        Listenelement hilf = head;
        int i = 1;
        while (i < k) {
            hilf = hilf.next;
            i++;
        }
        if (hilf != z) {
            insert(dataEle, hilf);
        }
            
    }

    // Loeschen des k.ten Listenelements aus der Liste
    // falls weniger als k Elemente in der Liste sind, 
    // wird null zurueckgegeben, ansonsten das zugehoerige Datenelement
    protected Element removeElementAt(int k){
	Element dataEle = null; // Referenz auf zu loeschendes Element
	if (k >= 1 && k <= this.count){
	    Listenelement ele = head;
	    for (int i=1;i<k;i++){  // bis zu k-1. Listenelement gehen
		ele = ele.next;
	    }
	    dataEle = ele.next.data;  // Element-Referenz merken
	    ele.next = ele.next.next; // Element aus Liste loeschen
	    this.count--;
	}
	return dataEle;	
    }

    // gibt das k.te Datenelement zurueck, falls die Liste mindestens 
    // k Elemente enthaelt, ansonsten den Wert null
    protected Element getElementAt(int k){
	Element data = null;
	if (k <= this.count){
	    Listenelement ele = head.next;  // Zeiger auf erstes Listenelement
	    for (int i=2;i<=k;i++){  // Liste bis zum Element k durchlaufen
		ele = ele.next;
	    }
	    data = ele.data;
	}
	return data;
    }

    public int size(){
	return this.count;
    }



}
