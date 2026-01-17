package javaSlips2025;

class thread extends Thread{
	String msg;
	int n;
	thread(String msg,int n){
		this.msg=msg;
		this.n=n;
	}
	public void run() {
			
		for(int i=0;i<n;i++) {
			System.out.println(msg);
		}
			
	}
}
public class slip8_1 {

	public static void main(String[] args) {
		thread t1=new thread("COVID19",10);
		thread t2=new thread("LOCKDOWN2020",20);
		thread t3=new thread("VACCINATED",30);
		t1.start();
		t2.start();
		t3.start();
	}

}
