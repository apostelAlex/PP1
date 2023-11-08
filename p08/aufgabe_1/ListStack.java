// Alexandros Apostolidis
package p08.aufgabe_1;
import p08.data.Element;
import p08.types.List;
import p08.types.Stack;

public class ListStack extends List implements Stack {
    public boolean push(Element e){
        if (this.size()==MAX_SIZE) {
            return false;
        }
        insertElementAt(e, 1);
        return true;
    }

    public Element pop(){
        return removeElementAt(1);
    }

    public Element peek(){
        return getElementAt(1);
    }


    public Element[] toArray(){
        Element[] res = new Element[size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = getElementAt(i+1);
        }
        return res;
    }
    
}