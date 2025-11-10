package Coding_QA;

import java.util.Scanner;

public class Coding_5 {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the table number:");
		int input = s.nextInt();
		System.out.println(+input);
		
	//  problem: print 10 number from an array using loop		
	//-------------------------------------------------------	
		/*int num[] =  {9,8,7,6,5,4,3,2,1,0};
		
		for (int i=0;i<=9;i++) {
			
			System.out.println(num[i]);
		}*/
	
	//  problem: 2 tables	
	//-------------------------	
	/*	for(int i =1;i<=10;i++) {
			System.out.println(i +"x 2 =" +i*2 );
		}*/
	
	
	// problem 3:  tables prpgram
	
	for (int i =1;i<=20;i++) { 
		System.out.println(input +"x"+i+ "="+ i*input);
	}
}}
