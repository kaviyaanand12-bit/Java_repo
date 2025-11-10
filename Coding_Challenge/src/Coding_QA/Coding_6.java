package Coding_QA;

import java.util.Scanner;

public class Coding_6 {

	public static void main(String[] args) {
		
		//problem:
		//get the size of  the array
		// get the input of  the each elemment of  array
		// find and print the middle  element  value from the array

		Scanner s =  new Scanner(System.in);
		System.out.println("Enter the size of  the array:");
		int input =  s.nextInt();
		//System.out.println(input);
		
		//get the size of  the array
		int array[] = new int[input]; 
		
		System.out.println("Enter the input of array:" );
		
		
	    //get the input of  the each elemment of  array
		for (int i =0;i<=input-1;i++) {
			array[i] = s.nextInt();
			}
		for (int i =0;i<=input-1;i++) {
		System.out.println(array[i]);
	}

		
		// find and print the middle  element  value from the array
		int midelement= input/2;
		System.out.println("Enter middle  number  of  an array:" +array[midelement]);
			
		}
		 //get the size of  the array
		
		

	}
	

