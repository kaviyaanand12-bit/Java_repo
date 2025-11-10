package Coding_QA;

public class minimum_number {

	public static void main(String[] args) {
		
	//find the largest number
		
		int [] number = {12,13,90,60,54,39,200,500};
		int min =number[0];
		
		for (int i=1;i<number.length;i++) {
			if(number[i]<min) {
				min =number[i];
			}}
		
			System.out.println("Largest number in the array:" +min);
		}

	}
	


