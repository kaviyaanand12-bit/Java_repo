package Coding_QA;

import java.util.Scanner;

public class Coding_2 {

	public static void main(String[]args) {
	
	//problem: get start value  and end value , print the between values in ascending order
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the starting value:");
	int a =scan.nextInt();
	System.out.println("Enter the ending value:");
	int b =scan.nextInt();
	
	for (int i=a;i<=b;i++) {
		System.out.print("Element in order:"); 
		System.out.println(i);
	}
	
}}
