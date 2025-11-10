package Coding_QA;

import java.util.Scanner;

public class Coding_1 {

	public static void main(String[] args) {
		
	int a[] = {2,4,5,6,4,32,2,87,9,8,7,9};
	
	for (int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println("duplicate of  the array:" +a[i]);
			}
		}
	    }
	    

	}

}
