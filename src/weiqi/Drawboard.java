package weiqi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawboard extends JPanel{
	private LegalMove lm;
	public Drawboard() {
		setSize(950,950);
		setBackground(Color.YELLOW);
		lm = new LegalMove();
		
		XiaQi xiaqi = new XiaQi();
		addMouseListener(xiaqi);
		
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 25;i<=925;i+=50) {
			g.drawLine(i, 25, i, 925);
		    g.drawLine(25, i, 925, i);
		}
		g.fillOval(215, 215, 20, 20);
		g.fillOval(215, 715, 20, 20);
		g.fillOval(715, 215, 20, 20);
		g.fillOval(715, 715, 20, 20);
	}
	class XiaQi implements MouseListener,MouseMotionListener{
		private QiZi qizi;
		private boolean bw = true;
		private int xloc;
		private int yloc;
		private int logicnum;
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Graphics g = getGraphics();
			
			xloc = e.getX()/50;
			yloc = e.getY()/50;
			logicnum = xloc+yloc*19;
			if(lm.testlegal(logicnum) == 0) {
			qizi = new QiZi((25+xloc*50),(25+yloc*50));
			if (bw == true) {
				bw = false;
				qizi.drawblack(g);
			}else {
				bw = true;
				qizi.drawwhite(g);
			}
			} else {
				new Error();
			}
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
			
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
