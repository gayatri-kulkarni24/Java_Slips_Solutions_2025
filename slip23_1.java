package javaSlips2025;

import java.util.Scanner;

public class slip23_1 extends Thread{
	public slip23_1() {
		Thread t=new Thread(this);
		t.start();
	}
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String");
			String name=sc.next();
				for(char ch:name.toCharArray()) {
					if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ) {
						System.out.println(ch);
						Thread.sleep(4000);
					}
				}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new slip23_1();
	}
}
