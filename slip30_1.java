package javaSlips2025;
class threadSync extends Thread{
	static synchronized public void display() {
		System.out.println(Thread.currentThread().getName()); 
	}
	public void run() {
		for(int i=0;i<10;i++) {
			display();
		}
	}
}
public class slip30_1 {

	public static void main(String[] args) {
		threadSync t=new threadSync();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("THREAD-1");
		t2.setName("THREAD-2");
		t1.start();
		t2.start();
		
		
	}

}
