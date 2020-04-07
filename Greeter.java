import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Greeter extends JFrame implements ActionListener
{
	private JButton bttn1, bttn2;
	private JLabel lbl1;
	private JTextField tf1;
	
	public Greeter()
	{
		setTitle("GREETER");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		bttn1 = new JButton("GREET");
		bttn2 = new JButton("CLEAR");
		lbl1 = new JLabel("ENTER YOUR NAME: ");
		tf1 = new JTextField(20);
		c.add(lbl1);
		c.add(tf1);
		c.add(bttn1);
		c.add(bttn2);
		bttn1.addActionListener(this);
		bttn2.addActionListener(this);
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Greeter g = new Greeter();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String name = "";
		
		if(ae.getSource() == bttn1)
		{
			name = tf1.getText();
			tf1.setText("HELLO! " + name);
		}
		
		if(ae.getSource() == bttn2)
		{
			tf1.setText("");
		}
	}
}