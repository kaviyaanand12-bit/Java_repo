package Coding_QA;

public class Garden {

	int  apple_price  =  20;
	int apple_count =5;
	
	void Total_Money() {
		int total = apple_price *apple_count;
		System.out.println("Display the amount:" +total);
	}
		
	public static void main(String[] args) {
		
		Garden g =  new Garden();
		g.Total_Money();
			
		}
	}


