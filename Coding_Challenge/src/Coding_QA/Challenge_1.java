package Coding_QA;

import java.util.Scanner;

public class Challenge_1 {

	public static void main(String[] args) {
		// get the input for  the variable: Name and Age - print it
//
//		String Name;
//		int Age;
		
//		Name = "Kaviya";
//		Age = 24;
		
		Scanner value = new Scanner(System.in);
		
		
		System.out.println("Enter your name:");
		String name = value.nextLine();
		System.out.println("My Name is " +name);
		
	
		System.out.println("Enter your age:");
		int age = value.nextInt();
		System.out.println("My Age is " +age);
		
		
	}

}
