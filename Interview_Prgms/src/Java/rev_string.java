package Java;

public class rev_string {

	public static void main(String[] args) {
	
		String name	= "Kaviya";
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
			

	}

}
