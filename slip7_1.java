package javaSlips2025;

import java.util.Random;

class thread1 implements Runnable{
	Random r;
	int n;
	Thread t;
	public thread1() {
		t=new Thread(this);
		t.start();
	}
	public void run() {
		r=new Random();
		for(int i=0;i<8;i++) {
			n=r.nextInt(10);
			if(n%2==0) {
				thread2 t2=new thread2(n);
				t=new Thread(t2);
				t.start();
			}else {
				thread3 t3=new thread3(n);
				t=new Thread(t3);
				t.start();
			}
		}
	}
	
}
class thread2 implements Runnable{
	int n,sqr;
	thread2(int n){
		this.n=n;
	}
	public void run() {
		System.out.println("Square::"+Math.pow(n,2));
	}
}
class thread3 implements Runnable{
	int n,cube;
	thread3(int n){
		this.n=n;
	}
	public void run() {
		System.out.println("Cube::"+Math.pow(n,3));
	}
}
public class slip7_1 {

	public static void main(String[] args) {
		new thread1();
	}

}
