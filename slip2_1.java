package javaSlips2025;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class slip2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of friends");
		int n=sc.nextInt();
		HashSet<String> hs=new HashSet<String>();
		System.out.println("Enter name of friend");
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		TreeSet<String> sort=new TreeSet<String>(hs);
		System.out.println(sort);
		

	}

}
