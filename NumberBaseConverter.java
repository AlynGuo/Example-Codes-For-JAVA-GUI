import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberBaseConverter extends JFrame implements ActionListener
{
	private ButtonGroup bg;
	private JButton b1;
	private JLabel l1, l2, l3;
	private JRadioButton r1, r2, r3;
	private JTextField t1, t2;
	
	public NumberBaseConverter()
	{
		setTitle("NUMBER BASE CONVERTER");
		bg = new ButtonGroup();
		b1 = new JButton("CONVERT");
		l1 = new JLabel("ENTER A NUMBER: ");
		l2 = new JLabel("EQUIVALENT: ");
		l3 = new JLabel("CONVERT TO: ");
		r1 = new JRadioButton("BINARY");
		r2 = new JRadioButton("HEXADECIMAL");
		r3 = new JRadioButton("OCTAL");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		Container c = getContentPane();
		c.setLayout(new GridLayout(6, 2));
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(l3);
		c.add(b1);
		c.add(r1);
		c.add(r2);
		c.add(r3);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		setSize(300, 150);
		setVisible(true);
		b1.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		NumberBaseConverter nbc = new NumberBaseConverter();
		nbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int num;
		String strnum = "";
		
		if(r1.isSelected())
		{
			strnum = t1.getText();
			num = Integer.parseInt(strnum);
			strnum = Integer.toBinaryString(num);
			t2.setText(strnum);
		}
		
		if(r2.isSelected())
		{
			strnum = t1.getText();
			num = Integer.parseInt(strnum);
			strnum = Integer.toHexString(num);
			t2.setText(strnum);
		}

		if(r3.isSelected())
		{
			strnum = t1.getText();
			num = Integer.parseInt(strnum);
			strnum = Integer.toOctalString(num);
			t2.setText(strnum);
		}
	}
}