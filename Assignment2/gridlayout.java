import java.awt.*;

class DemoGridLayout
{
	DemoGridLayout()
	{
		Frame f = new Frame("Grid Layout");

			f.setVisible(true);
			f.setSize(400, 400);

		Button one = new Button("First");
		Button two = new Button("Second");
		Button three = new Button("Third");
		Button four = new Button("Fourth");

		f.add(one);f.add(two);f.add(three);f.add(four);

			f.setLayout(new GridLayout(2,2)); // 2 rows and 2 columns
	}

	public static void main(String[] args) 
	{
		new DemoGridLayout();	
	}
}