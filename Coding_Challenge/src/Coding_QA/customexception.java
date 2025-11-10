package Coding_QA;

import java.util.Scanner;

class invalidAgeException extends Exception{
	
invalidAgeException(String s){
super(s);
}
	}
//}

class AgeValidator{
	void CheckAge(int a) {
		try {
		if (a<0 ||a>150) {
			throw new invalidAgeException ("Age is not valid");
		}
		else  {
			System.out.println("Valid age");
		}
		}
		
		catch (Exception e){
			System.out.println(e);
		}
		}
	}

public class customexception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a = scan.nextInt();
		AgeValidator obj = new AgeValidator();
		obj.CheckAge(a);

	}

}
