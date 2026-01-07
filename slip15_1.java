package javaSlips2025;

class thread11 extends Thread{
	public void run() {
		System.out.println("Thread Name"+Thread.currentThread().getName());
		System.out.println("Thread Priority"+Thread.currentThread().getPriority());
	}
}
public class slip15_1 {

	public static void main(String[] args) {
		thread11 t=new thread11();
		t.setPriority(4);
		t.start();

	}

}
