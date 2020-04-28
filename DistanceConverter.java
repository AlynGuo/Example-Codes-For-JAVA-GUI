import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DistanceConverter extends JFrame implements ActionListener
{
	private JButton bttn1, bttn2;
	private JLabel lbl1, lbl2;
	private JTextField tf1, tf2;
	
	public DistanceConverter()
	{
		setTitle("DISTANCE CONVERTER");
		bttn1 = new JButton("CONVERT");
		bttn2 = new JButton("CLEAR");
		lbl1 = new JLabel("ENTER DISTANCE IN MILES: ");
		lbl2 = new JLabel("EQUIVALENT IN KILOMETER: ");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2, 5, 5));
		c.add(lbl1);
		c.add(tf1);
		c.add(lbl2);
		c.add(tf2);
		c.add(bttn1);
		c.add(bttn2);
		setSize(350, 140);
		setVisible(true);
		bttn1.addActionListener(this);
		bttn2.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		DistanceConverter convert = new DistanceConverter();
		convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		double km, mile;
		String str = "";
		
		str = tf1.getText();
		mile = Double.parseDouble(str);
		
		if(ae.getSource() == bttn1)
		{
			km = mile * 1.609;
			str = String.valueOf(km);
			tf2.setText(str);
		}
		
		if(ae.getSource() == bttn2)
		{
			tf1.setText("");
			tf2.setText("");
		}
	}
}