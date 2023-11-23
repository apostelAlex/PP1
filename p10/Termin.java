// Alexandros Apostolidis
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
public class Termin implements Comparable<Termin>{
    LocalDateTime wann;
    String was;

    private Termin(LocalDateTime ldt, String was){
	this.wann = LocalDateTime.of(ldt.toLocalDate(),ldt.toLocalTime());
	this.was = was;
    }

    public Termin(int year, int month, int day, int hour, int minute, String descr){
	this(LocalDateTime.of(year,month,day,hour,minute),descr);	
    }

    public String toString(){
	DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd.MM.YY 'um 'HH':'mm'h  '",Locale.GERMAN);
	return dtf.format(this.wann) + "-->  " + was;
    }

    public boolean equals(Object other){
        return (other instanceof Termin) ?
            this.wann.equals(((Termin)other).wann) && this.was.equals(((Termin)other).was) :
            false;
    }

    public int compareTo(Termin other){
        return this.wann.compareTo(other.wann);
    }

    public Termin clone(){
	return new Termin(LocalDateTime.of(this.wann.toLocalDate(),
                                           this.wann.toLocalTime()),this.was);
    }


}
