package javaSlips2025;

import java.util.HashMap;
import java.util.Scanner;

public class slip4_2 {

	public static void main(String[] args) {
		HashMap<String,String> hs=new HashMap<String,String>();
		hs.put("shrirampur", "68756");
		hs.put("vaijapur", "423701");
		hs.put("paithan", "748957");
		hs.put("nashik", "75897");
		System.out.println(hs);
		hs.remove("vaijapur");
		System.out.println(hs);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city to search");
		String name=sc.next();
		if(hs.containsKey(name)) {
			System.out.println(hs.get(name)+" found");
		}else {
			System.out.println(hs.get(name)+" NOT found");
		}
		

	}

}
