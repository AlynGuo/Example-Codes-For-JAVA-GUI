import java.awt.*;
import javax.swing.*;

public class Gooey extends JFrame
{
	private JButton bttn1, bttn2;
	private JLabel lbl1, lbl2;
	private JTextField tf1;
	
	public Gooey()
	{
		setTitle("GOOEY");
		lbl1 = new JLabel("LAYOUT PRACTICE");
		lbl2 = new JLabel("TYPE YOUR NAME: ");
		tf1 = new JTextField(20);
		bttn1 = new JButton("CLICK");
		bttn2 = new JButton("CLEAR");
		setLayout(null);
		lbl1.setBounds(50, 30, 120, 40);
		lbl2.setBounds(50, 80, 120, 40);
		tf1.setBounds(250, 80, 150, 40);
		bttn1.setBounds(50, 160, 100, 50);
		bttn2.setBounds(250, 160, 100, 50);
		add(lbl1);
		add(lbl2);
		add(tf1);
		add(bttn1);
		add(bttn2);
		setSize(450, 300);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		Gooey g = new Gooey();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}