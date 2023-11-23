// Alexandros Apostolidis
import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel{
    private int w,h;
    private java.awt.image.BufferedImage img;

    public ImagePanel(int w, int h){
	this.setPreferredSize(new Dimension(w,h));
    }

    public void setImage(String filename){
	this.img = loadImage(filename);
	this.repaint();
    }

   public void setImage(java.io.File f){
       this.setImage(f.getPath());
    }


   private java.awt.image.BufferedImage loadImage(String filename){
	java.awt.image.BufferedImage img = null;
	try {
	    img = javax.imageio.ImageIO.read(new java.io.File(filename));
	} catch (java.io.IOException e){
	    System.out.println("Could not read image " + filename);
	}
	return img;
    }

    public void paint(Graphics g){
	if (this.img != null){
	    this.w = img.getWidth();
	    this.h = this.img.getHeight();
	    this.setPreferredSize(new Dimension(w,h));
	    this.revalidate();
	}
	g.clearRect(0,0,this.getWidth(),this.getHeight());
	g.setColor(Color.black);
	g.fillRect(0,0,this.getWidth(),this.getHeight());
	g.drawImage(this.img, 0, 0, this);
    }
}
