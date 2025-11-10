package Coding_QA;

import java.util.Scanner;

public class reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		
		String str = s.nextLine();
		String reverse ="";
		
		for (int i=str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);	
		}
		System.out.println("Original String:"  +str);
		System.out.println("Reverse a String:" +reverse);
	}

}	