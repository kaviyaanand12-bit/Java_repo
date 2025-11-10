package Coding_QA;

import java.util.Scanner;

public class exceptionpractice {

	void divideNumbers(int numerator, int denominator ) {

		try {	
		int result = numerator/denominator;
		System.out.println(result);
		}	
		catch(Exception e){
		System.out.println("cannot  divide  by Zero");
		}
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int numerator = scan.nextInt();
	int denominator=scan.nextInt();
	
	exceptionpractice obj  =new  exceptionpractice();
	obj.divideNumbers(numerator,denominator);
	

	}

	}
