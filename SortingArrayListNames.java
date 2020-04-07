package array;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SortingArrayListNames extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn, btnclr, disbtn;
	private JTextField tf;
	private JTextArea TA1, TA2;
	ArrayList<String> Letter = new ArrayList<String>();
	
	public SortingArrayListNames() {
		
		setTitle("Names");
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
		
		SortingArrayListNames s = new SortingArrayListNames();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String str ="";
	    int idx;
	    String n;
		str = tf.getText();
		
		
	
		if(ae.getSource()==btn) {
			
			TA1.append(str+"\n");
			Letter.add(str);
		}
		
		if(ae.getSource()==btnclr) {
			
			TA1.setText("");
			TA2.setText("");
			tf.setText("");
		}
		
		if(ae.getSource()==disbtn) {
			
			Collections.sort(Letter);
			
			for(idx = 0; idx < Letter.size(); idx++) {
				
				n = Letter.get(idx);
				TA2.append(n + "\n");
			}
        
			
			Letter.clear();
		}
	}
}