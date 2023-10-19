public class Rekursion2 {

    /* *** Aufgabe 2a *** */
    // rekursive Methode zur Approximation der Wurzel einer positiven
    // Zahl x. Die Wurzel wird in dem Intervall [a,b] gesucht
    // 3
    public static double wurzelRek(double x, double epsilon, double a, double b) {

        double z = (a+b)/2;
        double z2 = z*z;
        if (Math.abs(z2 - x) < epsilon) 
            return z;
        
        if (z2 < x)
            return wurzelRek(x, epsilon, z, b);
        else
            return wurzelRek(x, epsilon, a, z);

    }

    /* *** Aufgabe 2b *** */
    // rekursive Methode, die aus einer positiven, ganzen Zahl die
    // Umkehrzahl bestimmt
    // 3
    public static long reverseNumber(long z, long r) {
        if (z == 0)
            return r;

        else {
            long temp = z % 10;
            z /= 10;
            r *= 10;
            r += temp;
            return reverseNumber(z, r);
        }
    }
    

    public static void main(String[] args) {
        // Aufgabenteil (a)
        double x;
        do {
            x = IOTools.readDouble("x = ");
        } while (x < 1.0);

        System.out.println("sqrt(" + x + ") \u2248 " + wurzelRek(x,1e-8,1.0,x));


        // Aufgabenteil (b)
        long z;
        do {
            z = IOTools.readLong("z = ");
        } while (z < 1);

        System.out.println(z + " -> " + reverseNumber(z,0));
        System.out.println();
    }
}
