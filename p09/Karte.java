// Alexandros Apostolidis
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Karte {
    private BufferedImage bild;
    private Position[] positions = new Position[2];
     
    public Karte(String filename){
	try {
	    this.bild = ImageIO.read(new File(filename));
	} catch (IOException e){
	    System.out.println("Could not read filename");
	    e.printStackTrace();
	}
    }

    // setze die beiden Positionen fuer eine Karte
    public void setPositionen(Position p1, Position p2){
	positions[0] = p1;
	positions[1] = p2;
    }

    // gibt Bild (auf Vorderseite) der Karte zurueck
    public Image getImage(){
	return this.bild;
    }

    // innere Klasse fuer die Kartenposition
    public static class Position{
	int zeile, spalte;
	public Position(int r, int c){
	    this.zeile = r;
	    this.spalte = c;
	}
	public int getZeile(){
	    return this.zeile;
	}
	public int getSpalte(){
	    return this.spalte;
	}
    }
}
