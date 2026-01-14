package javaSlips2025;

import java.util.*;

public class slip3_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		//System.out.println("Enter elements of list");
//		for(int i=0;i<n;i++) {
//			list.add(null)
//		}
		list.add("gayatri");
		list.add("gsk");
		list.add("guddu");
		list.add("mohini");
		list.add("vaidehi");
		System.out.println(list);
		list.addLast("75893");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		for(String rev:list.reversed()) {
			System.out.println(rev);
		}
		

	}

}
