public class StringTest {

    /* *** Aufgabe 1a *** */    
    // 2
    public static String filterLetters(String s) {
        StringBuffer res = new StringBuffer();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (Character.isLetter(c)){
                res.append(Character.toLowerCase(c));
            }
        }
        return res.toString();  // Dummy Return
    }


    /* *** Aufgabe 1b *** */
    // 2.5
    public static boolean isPalindromeIt(String s) {
        for (int i = 0; i <= s.length()-i; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true; // Dummy Return
    }

    /* *** Aufgabe 1c *** */
    // 2.5
    public static boolean isPalindromeRek(String s) {
        int l = s.length()-1;
        if(l<1)
            return true;
        if (s.charAt(0) == s.charAt(l))
            return isPalindromeIt(s.substring(1, l));
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
