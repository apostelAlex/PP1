// Alexandros Apostolidis
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class ImageViewer extends JFrame {
    ImagePanel ip;

    public ImageViewer () {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	createMenu();
	createComponents();
	this.setLocation(100,100);
	this.pack();
    }

    private void createComponents(){
	Container c = this.getContentPane();
	this.ip = new ImagePanel(400,300);
	JScrollPane sc = new JScrollPane(ip);
	c.add(sc);
    }

    /* *** Aufgabe 3 *** */
    private void createMenu(){
		JMenu fileMenu = new JMenu("File");
		JMenuItem bl = new JMenuItem("Bild laden");
		bl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int result = fc.showOpenDialog(ImageViewer.this);

				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fc.getSelectedFile();
					// You might want to add additional checks here to ensure the file is an image
					ip.setImage(selectedFile); // Assuming setImage() handles setting and displaying the image
				}	
            }
        });
		fileMenu.add(bl);
		JMenuBar jb = new JMenuBar();
		jb.add(fileMenu);
		this.setJMenuBar(jb);

    }

 

    public static void main(String[] args){
	ImageViewer iv = new ImageViewer();
	iv.setVisible(true);
    }
}
