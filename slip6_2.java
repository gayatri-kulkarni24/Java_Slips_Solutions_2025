package javaSlips2025;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class slip6_2 extends JFrame implements Runnable,ActionListener{

	JLabel l1,l2;
	JRadioButton b1,b2,b3;
	ButtonGroup btnGroup;
	JButton btn;
	JPanel panel;
	Thread t;
	boolean running=true;
	public slip6_2() { 
			t=new Thread(this);
			setSize(400,300);
			l1=new JLabel("Traffic Lights",SwingConstants.CENTER);
			add(l1,BorderLayout.NORTH);
			l2=new JLabel("",SwingConstants.CENTER);
			add(l2);
			b1=new JRadioButton("RED");
			b1.setForeground(Color.RED);
			b2=new JRadioButton("YELLOW");
			b2.setForeground(Color.yellow);
			b3=new JRadioButton("GREEN");
			b3.setForeground(Color.green);
			btnGroup=new ButtonGroup();
			btnGroup.add(b1);
			btnGroup.add(b2);
			btnGroup.add(b3);
			btn=new JButton("Start");
			panel=new JPanel(new FlowLayout());
			panel.add(b1);
			panel.add(b2);
			panel.add(b3);
			panel.add(btn);
			add(panel,BorderLayout.SOUTH);
			btn.addActionListener(this);
			setVisible(true);
	}
	public void run() {
		try {
			while(running) {
				b1.setSelected(true);
				if(b1.isSelected()) {
					l2.setText("STOP");
					l2.setForeground(Color.red);
				}
				Thread.sleep(5000);
				b2.setSelected(true);
				if(b2.isSelected()) {
					l2.setText("READY");
					l2.setForeground(Color.yellow);
				}
				Thread.sleep(5000);
				b3.setSelected(true);
				if(b3.isSelected()) {
					l2.setText("GO");
					l2.setForeground(Color.green);
				}
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.out.println("RUN");
			t.start();
		}
		
	}
	public static void main(String[] args) {
		new slip6_2();
		

	}
	
	

	

}
