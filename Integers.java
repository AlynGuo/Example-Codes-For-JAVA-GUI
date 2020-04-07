package tester;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Sample extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn, btnclr, disbtn;
	private JTextField tf;
	private JTextArea TA1, TA2;
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	public Sample() {
		
		setTitle("Numbers");
		tf = new JTextField(12);
		btn = new JButton("ADD");
		disbtn = new JButton("Display");
		btnclr = new JButton("CLEAR");
		TA1 = new JTextArea(5, 10);
		TA2 = new JTextArea(5, 10);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(tf);
		con.add(btn);
		con.add(disbtn);
		con.add(btnclr);
		con.add(TA1);
		con.add(TA2);
		setSize(340, 170);
		setVisible(true);
		btn.addActionListener(this);
		btnclr.addActionListener(this);
		disbtn.addActionListener(this);
	}
	
	public static void main(String[]args) {
		
		Sample sam = new Sample();
		sam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String str ="";
		int idx, i, total = 0;
		str = tf.getText();
		i = Integer.parseInt(str);
		
		if(ae.getSource()==btn) {
			
			TA1.append(str+"\n");
			num.add(i);
		}
		
		if(ae.getSource()==btnclr) {
			
			TA1.setText("");
			TA2.setText("");
			tf.setText("");
		}
		
		if(ae.getSource()==disbtn) {
			
			for(idx = 0; idx < num.size(); idx++) {
				
				TA2.append(num.get(idx)+"\n");
				total = total +(num.get(idx));
			}
			
			TA2.append("Total is "+ String.valueOf(total));
			num.clear();
		}
	}
}