package javaSlips2025;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class slip6_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		Set<Integer> el=new TreeSet<Integer>();
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			el.add(num);
		}
		System.out.println(el);
		System.out.println("Enter elements to search");
		int no=sc.nextInt();
		if(el.contains(no)) {
			System.out.println(no+"Found");
		}else {
			System.out.println(no+" NOT Found");
		}
	}

}
