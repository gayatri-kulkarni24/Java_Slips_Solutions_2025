package javaSlips2025;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class slip21_1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Subjects");
		int n=sc.nextInt();
		System.out.println("Enter subjects");
		for(int i=0;i<n;i++) {
			String sub=sc.next();
			ll.add(sub);
		}
		System.out.println("Subjects are");
		Iterator s=ll.listIterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}

	}

}
