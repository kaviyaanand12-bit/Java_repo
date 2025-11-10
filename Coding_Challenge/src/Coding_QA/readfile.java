package Coding_QA;

import java.io.BufferedReader;
import java.io.FileReader;

public class readfile {

	public static void main(String[] args) throws Exception {
	
		FileReader f1 = new FileReader("readfile.txt");  // filereader will read each characater and save
		BufferedReader b1 = new BufferedReader(f1);  
		// is used to read text from character-based input streams efficiently by buffering characters.  
		
		String text = b1.readLine();   // saved in the  string datatype to  read the text
		// readLine is  to read string line
		
		while(text!= null)
		{
			System.out.println(text);
			text = b1.readLine();
		}
		
       
		
	}

}
