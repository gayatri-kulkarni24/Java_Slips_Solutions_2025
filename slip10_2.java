//slip10_2.java
package slips.com.MyServlet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class slip10ii extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4;
	JPanel panel;
	JButton btn;
	Connection con;
	public slip10ii() {
		setSize(300,400);
		l1=new JLabel("Product Details",SwingConstants.CENTER);
		add(l1,BorderLayout.NORTH);
		panel=new JPanel(new FlowLayout());
		l2=new JLabel("");
		panel.add(l2);
		l3=new JLabel("");
		panel.add(l3);
		l4=new JLabel("");
		panel.add(l4);
		add(panel,BorderLayout.CENTER);
		btn=new JButton("fetch");
		add(btn,BorderLayout.SOUTH);
		btn.addActionListener(this);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent el) {
		System.out.println("hellow");
		if(el.getSource()==btn) {
			try {
				Class.forName("org.postgresql.Driver");
				
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gayatri","postgres","");
				
				String q="select * from product";
				Statement p=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=p.executeQuery(q);
				if(rs.first()) {
					l2.setText("Product id is " +rs.getInt(1));
					
					l3.setText("Product name is " +rs.getString(2));
					l4.setText("Product price is " +rs.getInt(3));
					
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	public static void main(String[] args) {
		new slip10ii();
	}
	
	

}
