import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener
{
	private JButton bttn1, bttn2, bttn3, bttn4, bttn5;
	private JLabel lbl1, lbl2, lbl3;
	private JTextField tf1, tf2, tf3;
	
	public SimpleCalculator()
	{
		setTitle("SIMPLE CALCULATOR");
		bttn1 = new JButton("+");
		bttn2 = new JButton("-");
		bttn3 = new JButton("×");
		bttn4 = new JButton("÷");
		bttn5 = new JButton("CLEAR");
		lbl1 = new JLabel("ENTER FIRST NUMBER: ");
		lbl2 = new JLabel("ENTER SECOND NUMBER: ");
		lbl3 = new JLabel("RESULT: ");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		Container c = getContentPane();
		c.setLayout(new GridLayout(6, 2, 5, 5));
		c.add(lbl1);
		c.add(tf1);
		c.add(lbl2);
		c.add(tf2);
		c.add(lbl3);
		c.add(tf3);
		c.add(bttn1);
		c.add(bttn2);
		c.add(bttn3);
		c.add(bttn4);
		c.add(bttn5);
		setSize(300, 150);
		setVisible(true);
		bttn1.addActionListener(this);
		bttn2.addActionListener(this);
		bttn3.addActionListener(this);
		bttn4.addActionListener(this);
		bttn5.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		double num1, num2, result;
		String str1 = "", str2 = "", str3 = "";
		
		str1 = tf1.getText();
		num1 = Double.parseDouble(str1);
		str2 = tf2.getText();
		num2 = Double.parseDouble(str2);
		
		if(ae.getSource() == bttn1)
		{
			result = num1 + num2;
			str3 = String.valueOf(result);
			tf3.setText(str3);
		}
		
		if(ae.getSource() == bttn2)
		{
			result = num1 - num2;
			str3 = String.valueOf(result);
			tf3.setText(str3);
		}
		
		if(ae.getSource() == bttn3)
		{
			result = num1 * num2;
			str3 = String.valueOf(result);
			tf3.setText(str3);
		}
		
		if(ae.getSource() == bttn4)
		{
			result = num1 / num2;
			str3 = String.valueOf(result);
			tf3.setText(str3);
		}
		
		if(ae.getSource() == bttn5)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
}