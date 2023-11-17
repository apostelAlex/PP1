// Alexandros Apostolidis
import javax.swing.JLabel;

public class ZaehlerLabel extends JLabel {
    private int z = 0;

    public ZaehlerLabel(){
	super("0");
    }
    
    public void increase(int delta){
	z += delta;
	this.setText("" + z);
    }

}
