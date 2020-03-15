import java.awt.*;
import javax.swing.JFrame;

class MyHouse extends Canvas

{



	public void paint(Graphics g)
	{


	

		g.setColor(Color.RED);
		g.fillRect(100,200,400,300);
		g.drawLine(70,200,300,20);
		g.drawLine(300,20,530,200);
		g.drawLine(70,200,530,200);

		int x[] = {70,300,530};
		int y[] = {200,20,200};
		g.setColor(new Color(155,95,85));
		g.fillPolygon(x,y,3);

		g.setColor(new Color(15,195,155));
		g.fillRect(220,300,150,50);


		g.setColor(Color.YELLOW);
		g.fillOval(600,50,70,70);

		g.setColor(Color.BLACK);
		g.drawLine(270,300,270,350);
		g.drawLine(320,300,320,350);

		g.setColor(Color.WHITE);
		g.fillOval(600,150,120,80);
		g.fillOval(650,120,90,70);
		g.fillOval(650,125,90,60);
		g.fillOval(680,137,95,65);

	
	}

	public static void main(String[] args) {
		MyHouse ob = new MyHouse();


		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(new Color(55,95,115));
		f.add(ob);

	}
}