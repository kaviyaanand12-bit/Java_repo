package Coding_QA;

public class Return_function {

	int  subraction(int a) {
	
		int rem = 15 -a;
	//	System.out.println();
		return rem;
		
	}
	
	int sum(int x, int y) {
		
		int z = x+y;
		return z;
	}
	void dummy() {
	//	int  a =  x1+x2;
		 
	}
	public static void main(String[] args) {
	
		Return_function output = new Return_function();
	    int r = output.subraction(1);
		System.out.println(r);
		int  sumkey =output.sum(1,2);
	System.out.println(sumkey);
//int s = output.dummy(5, 5);
//System.out.println(s);
	}

}
