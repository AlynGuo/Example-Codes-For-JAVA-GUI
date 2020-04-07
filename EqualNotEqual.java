package prog;

/*** Alyssa Lyn Guo
 *    BIT-201   ***/

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BiggerNumber extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bot;
	private JLabel lb1, lb2, lb3;
	private JTextField tf1, tf2;
	private static JTextField tf3;
	
	public BiggerNumber() {
		
		setTitle("Comparator");
		lb1 = new JLabel("Enter first number:");
		lb2 = new JLabel("Enter second number:");
		lb3 = new JLabel("Result:");
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);
		tf3 = new JTextField(15);
		bot = new JButton("Bot");
		Container con = getContentPane();
		con.setLayout(new GridLayout(4, 2, 10, 10));
		con.add(lb1);
		con.add(tf1);
		con.add(lb2);
		con.add(tf2);
		con.add(lb3);
		con.add(tf3);
		con.add(bot);
		setSize(470, 200);
		setVisible(true);
		bot.addActionListener(this);
		
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiggerNumber big = new BiggerNumber();
		big.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String s1, s2;
		double n1, n2;
		

		
		try {
		s1 = tf1.getText();
		s2 = tf2.getText();
		
		n1 = Double.parseDouble(s1);
		n2 = Double.parseDouble(s2);
		
		if(n1 == n2) {
			tf3.setText("EQUAL");
		}
		else{
			tf3.setText("NOT EQUAL");
		}
		

	}
		
	catch(NumberFormatException e) {
			
			tf3.setText("You must enter a number.");
		 
		}
}
}
		

		
		
	


