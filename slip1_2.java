package javaSlips2025;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class slip1_2 extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4;
	public slip1_2() {
		setSize(400,500);
		setLayout(new GridLayout(5, 2));
		 	JLabel l1 = new JLabel("Employee No:");
	        JLabel l2 = new JLabel("Employee Name:");
	        JLabel l3 = new JLabel("Designation:");
	        JLabel l4 = new JLabel("Salary:");
	        

	        t1 = new JTextField();
	        t2 = new JTextField();
	        t3 = new JTextField();
	        t4 = new JTextField();
	        JButton insertBtn = new JButton("Insert");
	        
	       add(l1);add(t1);
	       add(l2); add(t2);
	       add(l3); add(t3);
	       add(l4); add(t4);

	       add(insertBtn);
	       
	       insertBtn.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		 int eno = Integer.parseInt(t1.getText());
        String ename = t2.getText();
        String desq = t3.getText();
        double sal = Double.parseDouble(t4.getText());
		
        System.out.println(eno);
        System.out.println(ename);
        System.out.println(desq);
        System.out.println(sal);
	}
	public static void main(String[] args) {
		new slip1_2();

	}


	
	

}
