import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BFFList_2 extends JFrame implements ActionListener
{
	
	ArrayList<Integer>number = new ArrayList<Integer>();
	private JButton b1, b2, b3;
	private JTextArea ta1, ta2;
	private JTextField tf1;

	public BFFList_2()
	{
		setTitle("BFF LIST");
		b1 = new JButton("ADD");
		b2 = new JButton("CLEAR");
		b3 = new JButton("DISPLAY");
		ta1 = new JTextArea(10, 15);
		ta2 = new JTextArea(10, 15);
		tf1 = new JTextField(20);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(tf1);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(ta1);
		c.add(ta2);
		setSize(500, 250);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		BFFList_2 bff = new BFFList_2();
		bff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int idx, n, total = 0;
		String str = "";
		
		str = tf1.getText();
		n = Integer.parseInt(str);
		
		if(ae.getSource() == b1)
		{
			ta1.append(str + "\n");
			number.add(n);
		}
		
		if(ae.getSource() == b2)
		{
			ta1.setText("");
			ta2.setText("");
		}
		
		if(ae.getSource() == b3)
		{   
			for(idx = 0; idx < number.size(); idx++)
			{
				ta2.append(number.get(idx) + "\n");
				total = total + number.get(idx);
			}
			ta2.append("TOTAL IS " + String.valueOf(total));
			number.clear();	
		}
	}
}