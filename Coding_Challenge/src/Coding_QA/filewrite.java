package Coding_QA;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class filewrite {

	public static void main(String[] args) throws Exception { // it is  a checked exception, should have throws exception
	
	//throw  exception
	//try{
	FileWriter file = new FileWriter("kaviya.txt"); // text file hanlding - wriite on text file
	BufferedWriter b = new BufferedWriter(file);  // file hanlding class
	b.append("its is java class");
	b.newLine();
	b.write("welcomes you");
	b.close(); //  close then only file will be saved
	System.out.println("file  written");
//	}
	//catch (Exception e){
		//System.out.println(e);
	
	}
	}
	

