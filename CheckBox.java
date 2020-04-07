import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBox extends JFrame implements ItemListener
{
	private JCheckBox ck1, ck2;
	private JTextField tf1, tf2;
	
	public CheckBox()
	{
		setTitle("CHECKBOX");
		ck1 = new JCheckBox("CB1");
		ck2 = new JCheckBox("CB2");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		Container ckbox = getContentPane();
		ckbox.setLayout(new GridLayout(2, 2, 10, 10));
		ckbox.add(ck1);
		ckbox.add(tf1);
		ckbox.add(ck2);
		ckbox.add(tf2);
		setSize(400, 200);
		setVisible(true);
		ck1.addItemListener(this);
		ck2.addItemListener(this);
	}
	
	public static void main(String args[])
	{
		CheckBox checkbox = new CheckBox();
		checkbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ck1.isSelected())
		{
			tf1.setText("CHECKBOX IS CHECKED.");
		}
		
		else
		{
			tf1.setText("CHECKBOX IS UNCHECKED.");
		}
		
		if(ck2.isSelected())
		{
			tf2.setText("CHECKBOX IS CHECKED.");
		}
		
		else
		{
			tf2.setText("CHECKBOX IS UNCHECKED.");
		}
	}
}