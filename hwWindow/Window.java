import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Container window;

    private JButton b;
    private JLabel l;
    private JTextField t;

    public Window() {
	this.setTitle("Weather Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	window = this.getContentPane();
	window.setLayout(new FlowLayout());

	l = new JLabel("Type in degree and select unit: ",null,JLabel.CENTER);
	window.add(l);
	t = new JTextField(12);
	window.add(t);
	System.out.println();
	b = new JButton("Convert!");
	window.add(b);
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setVisible(true);
    }
}
