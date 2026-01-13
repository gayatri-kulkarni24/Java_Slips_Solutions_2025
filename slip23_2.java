package javaSlips2025;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class slip23_2 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		for(String names:args) {
			list.add(names);
		}
		Iterator<String> i=list.iterator();
		System.out.println("Student names using iterator");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Student names using List iterator");
		ListIterator<String> li=list.listIterator(list.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		

	}

}
