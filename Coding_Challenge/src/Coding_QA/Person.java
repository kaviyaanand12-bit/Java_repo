package Coding_QA;

public class Person {

	public  String  name;
	protected int  age;
	private int socialsecurityNumber;
	String address;
}

	class employee extends Person{
	
		void test() {
			System.out.println("test");
		}
	
	public static void main(String[] args) {
		employee e = new employee();
		e.address ="VOC  block";
		e.age=12;
		e.name ="Kaviya";


}}
