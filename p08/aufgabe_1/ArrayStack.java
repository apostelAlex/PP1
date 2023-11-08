// Alexandros Apostolidis
package p08.aufgabe_1;
import p08.data.Element;
import p08.types.Stack;

public class ArrayStack implements Stack {

    int lastElem = -1;
    Element[] elems = new Element[MAX_SIZE];
    
    public int size(){
        return lastElem+1;
    }

    public Element[] toArray(){
        Element[] res = new Element[lastElem+1];
        int lE = lastElem;
        if (lE >= 0) {
            for (int i = 0; i <= lE; i++) {
                res[i] = elems[i];
            }
        }
        return res;
    }


    public Element peek(){
        if (lastElem == -1)
            return null;
        return elems[lastElem];
    }

    public Element pop(){
        Element temp = elems[lastElem];
        elems[lastElem] = null;
        lastElem--;
        return temp;
    }

    public boolean push(Element e){
        if (lastElem == MAX_SIZE-1) 
            return false;
        lastElem++;
        elems[lastElem] = e;
        return true;
    }
}
