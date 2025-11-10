package Coding_QA;



public class Parameterized_function {

	
	void  Sum(int a , int b) {
		int  c =a+b;
		System.out.println("Sum of  the function:" +c);
		
	}
	void  Sub(int a, int b) {
		System.out.println("Sub:" + (a-b));
	}
	void multiply(int  a , int b) {
		System.out.println( "Multiply:" +(a*b));
	}
	void  division (int  a, int b) {
		System.out.println("Division:" +(b/a));
	}
	public static void main(String[] args) {
    
		Parameterized_function p = new Parameterized_function();
		p.Sum(2, 4);
		p.division(2,10);
		p.multiply(2, 4);
		p.Sub(10, 5);

	}

}
