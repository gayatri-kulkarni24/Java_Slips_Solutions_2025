package javaSlips2025;

import java.util.LinkedList;

public class slip29_2 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add("this");
		list.add("is");
		list.add("java");
		list.add("program");
		System.out.println(list);
		list.addFirst("computer");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println("Length of List" +list.size());
		list.addLast("gayatri");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		System.out.println(list.reversed());
	}

}
