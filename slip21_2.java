package javaSlips2025;
class company{
	boolean chance=true;
	synchronized public void produce(int i)  throws InterruptedException{
		if(!chance) {
			wait();
		}
		System.out.println("Producer produced" + i + "item");
		chance=false;
		notify();
		
	}
	synchronized public void consume(int i) throws InterruptedException{
		if(chance) {
			wait();
		}
		System.out.println("Consumer consumed" + i + "item");
		chance=true;
		notify();
	}
	
}
class producer extends Thread{
	company c;
	producer(company c){
		this.c=c;
	}
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				c.produce(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class consumer extends Thread{
	company c;
	consumer(company c){
		this.c=c;
	}
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				c.consume(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class slip21_2 {

	public static void main(String[] args) {
		company c=new company();
		producer p=new producer(c);
		consumer cn=new consumer(c);
		p.start();
		cn.start();

	}

}
