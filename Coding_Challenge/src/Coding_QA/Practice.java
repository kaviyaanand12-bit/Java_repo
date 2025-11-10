package Coding_QA;

//final class and final variale cannot be override

 class Constantvalues{
	final double  p1 = 3.1;
	
	void display() {
		System.out.println("value:" +p1);
	}
}

class subclass extends Constantvalues{
  @Override void display() {
		System.out.println("Ovveride value:" +p1);
	}
}
public class Practice {

	public static void main(String[] args) {
		Constantvalues c= new Constantvalues();
		c.display();
		subclass s = new subclass();
		s.display();
		
	}

}
