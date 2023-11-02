// Alexandros Apostolidis
import java.util.*;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

public class HistorischePerson {
    private String name;
    private String beschreibung;
    private LocalDate geboren;
    private LocalDate gestorben;

    /* *** Aufgabe 2b *** */ 
    // 2
    public HistorischePerson(String infoStr){
        String[] temp = infoStr.split(";");
        name = temp[0];
        beschreibung = temp[1];
        int year = Integer.parseInt(temp[2].substring(0, 4));
        int month = Integer.parseInt(temp[2].substring(4,6));
        int day = Integer.parseInt(temp[2].substring(6));
        LocalDate date = LocalDate.of(year, month, day);
        geboren = date;
        year = Integer.parseInt(temp[3].substring(0, 4));
        month = Integer.parseInt(temp[3].substring(4,6));
        day = Integer.parseInt(temp[3].substring(6));
        date = LocalDate.of(year, month, day);
        gestorben = date;
    }

    /* *** Aufgabe 2c *** */ 
    // 1
    private Period alter() {
        return Period.between(geboren, gestorben);
    }

    /* *** Aufgabe 2d *** */ 
    // 2
    public String toString() {
        DateTimeFormatter tfFull = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        DateTimeFormatter tfShort = DateTimeFormatter.ofPattern("d. MMM yyyy", Locale.GERMAN);
        String bday;
        String dday;

        String month = geboren.getMonth().getDisplayName(TextStyle.FULL, Locale.GERMAN);
        if (month.length() > 4){
            bday = geboren.format(tfShort);
        } else {
            bday = geboren.format(tfFull);
        }
        month = gestorben.getMonth().getDisplayName(TextStyle.FULL, Locale.GERMAN);
        if (month.length() > 4){
            dday = gestorben.format(tfShort);
        } else {
            dday = gestorben.format(tfFull);
        }
        Period t = alter();
        return String.format("%s (%s):\n    %s - %s\n    Alter: %d Jahr(e), %d Monat(e), %d Tag(e)\n", name, beschreibung, bday, dday, t.getYears(), t.getMonths(), t.getDays());
    }


    /* *** Aufgabe 2e *** */ 
    // 1
    public long compareTo(HistorischePerson p2) {
        return ChronoUnit.DAYS.between(this.geboren, this.gestorben) - ChronoUnit.DAYS.between(p2.geboren, p2.gestorben);
    }


    /* *** Aufgabe 2f *** */ 
    // 3
    public static void sort(HistorischePerson[] hp) {
        long temp;
            for (int i = 1; i < hp.length; i++) {
                for (int j = 0; j < hp.length-i; j++) {
                    temp = hp[j].compareTo(hp[j+1]);
                        if (temp > 0) {
                            HistorischePerson p = hp[j];
                            hp[j] = hp[j+1];
                            hp[j+1] = p;
                        }
                }
                
            }
        }
}

