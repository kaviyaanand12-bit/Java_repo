package Coding_QA;

import java.util.Scanner;

public class Coding_4 {

	public static void main(String[] args) {
		// get  input  5 number using array and for loop
		

		Scanner scan  =  new Scanner(System.in);
		//int input = scan.nextInt();
		
		int[] arr = new  int[5];
		
		for (int i=0;i<=4;i++) {
			{	
			System.out.println("Enter the integer :");
			arr[i] = scan.nextInt();
			}
		}
	
			for (int i=0;i<=4;i++) {
				System.out.println(arr[i]);
			}
		
		}
	}
	


