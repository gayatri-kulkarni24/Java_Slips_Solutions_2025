package javaSlips2025;

public class slip10_1 extends Thread{
	Thread t;
	slip10_1(){
		t=new Thread(this);
		t.start();
	}
	public void run() {
		System.out.println("Currently excuting thread="+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		new slip10_1();

	}

}
