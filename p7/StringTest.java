public class StringTest {

    /* *** Aufgabe 1a *** */    
    // 2
    public static String filterLetters(String s) {
        
        return " ";  // Dummy Return
    }


    /* *** Aufgabe 1b *** */
    // 2.5
    public static boolean isPalindromeIt(String s) {
        
        return false; // Dummy Return
    }

    /* *** Aufgabe 1c *** */
    // 2.5
    public static boolean isPalindromeRek(String s) {
        
        return false;    // Dummy Return
    }
    
    public static void main(String[] args) {

        String[] pBeispiele =
            {"Erika feuert nur untreue Fakire.",
             "Ein Esel lese nie.",
             "Lag er im Kajak, mir egal.",
             "Trug Tim eine so helle Hose nie mit Gurt?",
             "Vitaler Nebel mit Sinn ist im Leben relativ!",
             "Der Freibierfred",
             "Genie, der Herr ehre Dein Ego!",
             "abcdecba"
            };

        for (String s : pBeispiele) {
            String t = filterLetters(s);
            if (isPalindromeIt(t)) {
                System.out.println("Iterativ: " + s);
            }
            if (isPalindromeRek(t)) {
                System.out.println("Rekursiv: " + s);
            }
        }
    }
}
