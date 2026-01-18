
package slips.com.MyServlet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class slip1ii extends JFrame{

	JTextField text;
	JLabel l1;
	slip1ii() {
		setSize(300,400);
		l1=new JLabel("abc",SwingConstants.CENTER);
		add(l1);
		text=new JTextField(20);
		add(text);
		setVisible(true);
	}
	
	public static void main(String[] args) {
			new slip1ii();
	}

}
