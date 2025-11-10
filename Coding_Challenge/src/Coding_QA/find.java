package Coding_QA;

import java.util.Scanner;

public class find {
	
	
	int  evenorodd(int num1) {
	
		
		if (num1%2==0) {
			System.out.println("its even");
		}
		else  {
			System.out.println("its Odd");
		}
		return num1;
	}
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Find odd or even:");
		find f1 = new find();
		f1.evenorodd(scan.nextInt());
		
	}

}
