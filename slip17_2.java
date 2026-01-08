package javaSlips2025;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class slip17_2 extends JFrame implements Runnable,ActionListener{
	Thread t;
	JButton btn;
	JLabel l1,l2;
	Random r;
	
	boolean running=true;
	public slip17_2() {
		t=new Thread(this);
		setSize(400,500);
		l1=new JLabel("Random numbers between 1 to 100",SwingConstants.CENTER);
		add(l1,BorderLayout.NORTH);
		l2=new JLabel("",SwingConstants.CENTER);
		add(l2);
		btn=new JButton("Generate");
		add(btn,BorderLayout.SOUTH);
		btn.addActionListener(this);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.out.println("run");
			t.start();
		}
		
	}
	public void run() {
			try {
				while(running) {
					r=new Random();
					int n=r.nextInt(100);
					l2.setText("Random number"+n);
					Thread.sleep(2000);
				}
				
			} catch (Exception e) {
				
			}	
	}
	public static void main(String[] args) {
		new slip17_2();

	}
}
