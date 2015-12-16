import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow(){
	this.setTitle("Weather Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JLabel description = new JLabel("Type in the degree and click a convert button");

	t = new JTextField();

	JButton ctof = new JButton("Celius to Fahrenheit");
	ctof.addActionListener(this);
	ctof.setActionCommand("CtoF");
	JButton ftoc = new JButton("Fahrenheit to Celius");
	ftoc.addActionListener(this);
	ftoc.setActionCommand("FtoC");

	j = new JLabel("Converted degrees here");
	pane.add(description);
	pane.add(t);
	pane.add(ctof);
	pane.add(ftoc);
	pane.add(j);
    }

    public static double CtoF(double t){
	return t*9.0/5.0+32.0;
    }
    public static double FtoC(double t){
	return (t-32.0)*5.0/9.0;
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    Double s = Double.parseDouble(t.getText());
	    j.setText(String.valueOf(CtoF(s)) + " degree Fahrenheit");
	}
	if(event.equals("FtoC")){
	    Double s = Double.parseDouble(t.getText());
	    j.setText(String.valueOf(FtoC(s)) + " degree Celsius");
	}
    }
 


}
