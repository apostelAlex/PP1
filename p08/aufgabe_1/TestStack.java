// Alexandros Apostolidis
package p08.aufgabe_1;

import p08.data.Element;
import p08.types.Stack;
import java.util.Arrays;


public class TestStack {
    public static void main(String[] args){

        Element[] elements = {new StudentElement("Tom","12131415"),
                            new StudentElement("Tom","11111111"),
                            new StudentElement("Anna","12312300"),
                            new StudentElement("Tim","11336699"),
                            new StudentElement("Tobi","10203040"),
                            new StudentElement("Suse","10000001")};
        ListStack ls = new ListStack();
        ArrayStack as = new ArrayStack();
        Stack[] stacks = {ls, as};

        for (Stack stack : stacks) {
            for (Element e : elements) {
                stack.push(e);
            }
        }
        System.out.println("Stack 1:");
        for (Stack stack : stacks) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                System.out.println(stack.pop());
            }
            System.out.println("---------------");
        }

        

        for (Stack stack : stacks) {
            for (Element e : elements) {
                stack.push(e);
            }
        }
            
        System.out.println("Stack 2:");

        for (Stack stack : stacks) {
            Element[] elems = stack.toArray();
            Arrays.sort(elems);
            for (int i = 0; i < elems.length; i++) {
                System.out.println(elems[i]);
            }
            System.out.println("---------------");
        }

        
        

    }
}
