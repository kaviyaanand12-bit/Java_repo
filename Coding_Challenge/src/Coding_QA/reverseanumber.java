package Coding_QA;

public class reverseanumber {

	public static void main(String[] args) {
	
		int z = 151;
		int reverse =0;
		int temp =z;
		
		while(z!=0) {
			
			int rem = z%10;
			reverse =reverse*10+rem;
			z=z/10;
			
		}
		System.out.println("Reverse of the number:" +reverse);
		
		if(temp==reverse) {
		
			System.out.println("its a palindrome");
		}
		
		}	
		
	}

