package Coding_QA;

import java.util.Scanner;

public class reverseword {

	public static void main(String[] args) {
		String s="sun is bright";
		String reverse="";
		
		
		String[] str =s.split(" ");
		
		System.out.println(str.length);
		
		
		for (int i=str.length-1;i>=0;i--) {
			reverse =reverse+str[i]+" ";
		}
		
		System.out.println(reverse);
		
	}
	
	
	
}
	

