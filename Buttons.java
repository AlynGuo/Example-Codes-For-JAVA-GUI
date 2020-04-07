import java.awt.*;
import javax.swing.*;

public class Buttons extends JFrame
{
	private JButton bttn1, bttn2, bttn3;
	
	public Buttons()
	{
		setTitle("BUTTONS");
		bttn1 = new JButton("TEST");
		bttn2 = new JButton("COMPUTE");
		bttn3 = new JButton("CLEAR");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(bttn1);
		c.add(bttn2);
		c.add(bttn3);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		Buttons b = new Buttons();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}