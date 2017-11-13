package weiqi;
import java.awt.*;
import javax.swing.*;

public class WeiQiWindow extends JFrame{
	private Drawboard db;
	public WeiQiWindow() {
		super("WeiQiPan");
		Container c = getContentPane();
		
		setSize(1100,1100);
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		db = new Drawboard();
		db.setBounds(25,25,950,950);
		c.add(db);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
