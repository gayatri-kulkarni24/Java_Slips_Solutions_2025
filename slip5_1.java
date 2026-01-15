package javaSlips2025;
import java.util.Hashtable;
import java.util.Enumeration;
public class slip5_1 {

	public static void main(String[] args) {
		        // Create a Hashtable to store mobile number (String) and student name (String)
		        Hashtable<String, String> ht = new Hashtable<>();

		        // Add student details to the Hashtable
		        ht.put("9876543210", "Amit Sharma");
		        ht.put("9123456789", "Neha Verma");
		        ht.put("9988776655", "Rahul Joshi");
		        ht.put("9001122334", "Sneha Patil");

		        // Display student details using Enumeration
		        System.out.println("Student Details:");
		        Enumeration<String> mn = ht.keys();

		        while (mn.hasMoreElements()) {
		            String mobile = mn.nextElement();
		            String name = ht.get(mobile);
		            System.out.println("Mobile: " + mobile + ", Name: " + name);
		        }
		    }
		

	}


