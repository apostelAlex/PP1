package p08.data;
 
public abstract class Element implements Comparable<Element> {

    private int counter=0;
    protected int id;

    public Element(){
	id = ++counter;
    }

    public String toString(){
	return "Element " +  id + ":";
    }
}
