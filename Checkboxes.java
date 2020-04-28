import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Checkboxes extends JFrame implements ItemListener
{
	private JCheckBox cb1, cb2, cb3;
	private JTextField tf1;
	
	public Checkboxes()
	{
		setTitle("CHECKBOXES");
		cb1 = new JCheckBox("10");
		cb2 = new JCheckBox("20");
		cb3 = new JCheckBox("30");
		tf1 = new JTextField(30);
		Container cb = getContentPane();
		cb.setLayout(new GridLayout(4, 1));
		cb.add(cb1);
		cb.add(cb2);
		cb.add(cb3);
		cb.add(tf1);
		setSize(200, 150);
		setVisible(true);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	
	public static void main(String args[])
	{
		Checkboxes checkbox = new Checkboxes();
		checkbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		int total = 0;
		tf1.setText("");
		
		if(cb1.isSelected())
		{
			total = total + 10;
		}
		
		if(cb2.isSelected())
		{
			total = total + 20;
		}
		
		if(cb3.isSelected())
		{
			total = total + 30;
		}
		
		tf1.setText("TOTAL IS " + String.valueOf(total));
	}
}