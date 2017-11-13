package weiqi;
import java.awt.*;
import javax.swing.*;

public class Error extends JFrame{
	public Error() {
		super("Error");
		setSize(300,150);
		setLocation(600,400);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel l1 = new JLabel("Illegal");
		l1.setBounds(120,40,100,30);
		c.add(l1);
		
		setVisible(true);
	}
}
