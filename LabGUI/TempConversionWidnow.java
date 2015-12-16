import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    public static double CtoF(double t){
	return t*9.0/5.0+32.0;
    }
    public static double FtoC(double t){
	return (t-32.0)*5.0/9.0;
    }

    private Container pane;
    private JLabel j;
    private JTextField t;

    public Window() {
	this.setTitle("Weather Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JLabel description = new JLabel("Type in the degrees and click the button that corresponds with it");

	t = new JTextField(10);

	JButton ctof = new JButton("Celius to Fahreinheit");
	b.addActionListener(this);
	b.setActionCommand("CtoF");
	JButton ftoc = new JButton("Fahrenheit to Celius");
	b2.addActionListener(this);
	b2.setActionCommand("FtoC");

	j = new JLabel("Converted degrees here");
	pane.add(description);
	pane.add(t);
	pane.add(ctof);
	pane.add(ftoc);
	pan.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    String s = t.getText();
	    j.setText(CtoF(s));
	}
	if(event.equals("FtoC")){
	    String s = t.getText();
	    j.setText(FtoC(s));
	}
    }
 


}
