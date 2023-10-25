// Alexandros Apostolidis
public class Rekursion1 {
    public static int fr(int a, int b){
	if (a > b) {
	    return 0;
	} else if (a == b) {
	    return b;
	} else {
	    return a + b + fr(a+1,b-1);
	}
    }

    public static int f(int z){
	return fr(1,z);
    }

    public static void main(String[] args){
	int z;
	do {
	    z = IOTools.readInteger("z = ");
	} while (z <= 0);

	System.out.println("Ergebnis: " + f(z));
    }
}
/*

(a) // 2 P
Für z = 4:
	-> fz (1, 4) -> fz (2, 3) -> fz (3,2) 	// Aufrufe
		10 <-		5 <-		0 <- 		// Rückgabewerte
	
Für z = 7:
	-> fz (1, 7) -> fz (2, 6) -> fz (3, 5) -> fz (4, 4)		// Aufrufe
		28 <-			20 <-		12 <-		4 <-		// Rückgabewerte

(b) // 1 P
f(z) = z/2*(z+1)

(c) // 2 P
Für fr(++a, --b) würde nichts passieren, da dies ein Präinkrement ist, das heißt, der Wert von a, bzw b
wird verändert bevor er der Funktion fr als Parameter übergeben wird.

Für fr(a++, b--) würde das Programm wahrscheinlich einen Rekursionsfehler ergeben, da die Funktion fr
stets mit den gleichen Werten aufgerufen wird und so der Rekursion kein Ende gemacht werden kann.

*/
