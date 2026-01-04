package javaSlips2025;

class thread21 extends Thread{
	public void run() {
		try {
			for(char ch='a';ch<='z';ch++) {
				System.out.println(ch);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class slip1_1 {
	public static void main(String[] args) {
		thread21 t=new thread21();
		t.start();
	}
}
