package Coding_QA;

abstract class Animal{
	abstract void makesound(); // abstract method should have body
}

class Dog extends Animal{

	@Override
	void makesound() {
		
	}
	

}
class Cat extends Animal{

	@Override
	void makesound() {
		
	}
	
	}

public class Abstract {

	public static void main(String[] args) {
	Dog d = new Dog();
	d.makesound();
	Cat c =  new Cat();
	c.makesound();
		
		
	}
 
	
	//testing the branch
}
