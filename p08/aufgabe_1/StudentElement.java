// Alexandros Apostolidis
package p08.aufgabe_1;
import p08.data.Element;


public class StudentElement extends Element {
    private String name;
    private String matriculationNumber;

    public StudentElement(String name, String matriculationNumber) {
        this.name = name;
        this.matriculationNumber = matriculationNumber;
    }

    public String toString() {
        return this.name + " (" + matriculationNumber +  ")";
    }

    public boolean equals(Object o) {
        return this.matriculationNumber
            .equals(((StudentElement) o).matriculationNumber);
    }


    public int compareTo(Element e2){
        if (e2 instanceof StudentElement){
            StudentElement se = (StudentElement) e2;
            int res = this.name.compareTo(se.name);
            if (res == 0) {
                return this.matriculationNumber.compareTo(se.matriculationNumber);
            }
            return res;
        }
        throw new RuntimeException("Parameter is not of type StudentElement");
        }

    
}
