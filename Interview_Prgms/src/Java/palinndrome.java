package Java;

public class palinndrome {

	public static void main(String[] args) {
	//palindrome program
		String str = "madam";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("it  is not palindrome");
		}

	}

}
