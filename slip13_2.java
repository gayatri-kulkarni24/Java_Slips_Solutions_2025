package javaSlips2025;

import java.util.Random;

public class slip13_2 extends Thread{
	Random r;
	Thread t;
	String name;
	int a[],sum=0;
	static double total=0;
	public slip13_2(String name) throws InterruptedException {
		t=new Thread(this);
		r=new Random();
		this.name=name;
		a=new int[10];
		t.start();
		t.join();
	}

	public void run() {
		for(int i=0;i<10;i++) {
			a[i]=r.nextInt(100);
		}
		for(int i=0;i<10;i++) {
			System.out.println(name+"="+a[i]);
			sum+=a[i];
		}
		total=total+sum;
		System.out.println("sum of "+name+" = "+sum);
	}
	static void avg() {
		double avg=total/10;
		System.out.println("total="+ total+"\n avaerage="+avg);
	}
	
	public static void main(String[] args) throws InterruptedException{
		slip13_2 t1=new slip13_2("Thread=1");
		slip13_2 t2=new slip13_2("Thread=2");
		slip13_2 t3=new slip13_2("Thread=3");
		slip13_2 t4=new slip13_2("Thread=4");
		slip13_2 t5=new slip13_2("Thread=5");
		slip13_2 t6=new slip13_2("Thread=6");
		slip13_2 t7=new slip13_2("Thread=7");
		slip13_2 t8=new slip13_2("Thread=8");
		slip13_2 t9=new slip13_2("Thread=9");
		slip13_2 t10=new slip13_2("Thread=10");
		avg();

	}

}
