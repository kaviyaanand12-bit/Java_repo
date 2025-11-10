package Coding_QA;

import java.util.Scanner;

public class duplicatestring {

	public static void main(String[] args) { 
		
		//Scanner s = new Scanner(System.in);
		//System.out.println("enter the string:");
		//String input  = s.nextLine();
		
		String input = "intervieww";
		   char[] ch = input.toCharArray();
		   int count=0;
		
		   for (int i=0;i<ch.length;i++) {
			   for  (int j=i+1;j<ch.length;j++) {
				   if (ch[i]==ch[j]) {
					   System.out.println("Reverse a String:" +ch[i]);
					   count++;
				   }
			   }
		   }
		   
		   System.out.println(count);
		   
			}
		}