import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PreliminaryExamination extends JFrame implements ActionListener
{
	private JButton bttn1;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JTextField tf1;
	
	public PreliminaryExamination()
	{
		setTitle("PRELIMINARY EXAMINATION");
		cb1 = new JCheckBox("BURGER");
		cb2 = new JCheckBox("FRIES");
		cb3 = new JCheckBox("HOTDOG");
		cb4 = new JCheckBox("PIZZA");
		tf1 = new JTextField(40);
		bttn1 = new JButton("CLICK TO ORDER");
		Container pe = getContentPane();
		pe.setLayout(new GridLayout(6, 1));
		pe.add(cb1);
		pe.add(cb2);
		pe.add(cb3);
		pe.add(cb4);
		pe.add(tf1);
		pe.add(bttn1);
		setSize(300, 150);
		setVisible(true);
		bttn1.addActionListener(this);	
	}
	
	public static void main(String args[])
	{
		PreliminaryExamination prelims = new PreliminaryExamination();
		prelims.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = "";
		tf1.setText("");
		
		if(cb1.isSelected())
		{
			str = str + " BURGER ";
		}
		
		if(cb2.isSelected())
		{
			str = str + " FRIES ";
		}
		
		if(cb3.isSelected())
		{
			str = str + " HOTDOG ";
		}
		
		if(cb4.isSelected())
		{
			str = str + " PIZZA ";
		}
		
		if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected())
		{
			tf1.setText("YOU LIKE THEM ALL.");
		}
		
		else
		{
			tf1.setText("YOU LIKE" + String.valueOf(str));
		}
	}
}