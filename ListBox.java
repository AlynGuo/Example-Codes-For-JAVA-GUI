import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListBox extends JFrame implements ListSelectionListener
{
	private JList l1;
	private JTextField tf1, tf2;
	DefaultListModel<String>i = new DefaultListModel<>();
	
	public ListBox()
	{
		setTitle("LIST");
		i.addElement("BURGER");
		i.addElement("DONUT");
		i.addElement("FRIES");
		i.addElement("PIZZA");
		i.addElement("SIOMAI");
		l1 = new JList<>(i);
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(l1);
		c.add(tf1);
		c.add(tf2);
		setSize(300, 150);
		setVisible(true);
		l1.addListSelectionListener(this);
	}
	
	public static void main(String[] args)
	{
		ListBox lb = new ListBox();
		lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void valueChanged(ListSelectionEvent lse)
	{
		int idx;
		Object str = "";
		
		idx = l1.getSelectedIndex();
		tf1.setText(String.valueOf(idx));
		str = l1.getSelectedValue();
		tf2.setText(String.valueOf(str));
	}
}