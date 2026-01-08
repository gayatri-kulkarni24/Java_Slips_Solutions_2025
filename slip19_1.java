package javaSlips2025;

import java.util.LinkedList;
import java.util.Scanner;

public class slip19_1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			int no=sc.nextInt();
			ll.add(no);
		}
		System.out.println("Negative elements");
		for(int el:ll) {
			if(el<0) {
				System.out.println(el);
			}
		}

	}

}
