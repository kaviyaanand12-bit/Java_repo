package Coding_QA;


// multiple inheritance using interface

interface Readable{
	default void read() {
		System.out.println("method  copy1");
	}

	void write();

	void store();
}
interface Writable{
	default void read(){
		System.out.println("method copy");
	}
}
interface Storable{
	void read3();
	
}

class file implements Readable,Writable, Storable {

	@Override
	public void store() {
	System.out.println("storing");
		
	}

	@Override
	public void write() {
		System.out.println("writing");
	}

	@Override
	public void read() {
		System.out.println("reading");	}

	@Override
	public void read3() {
		// TODO Auto-generated method stub
		
	}

}
public class innterface_practice {
	
	public static void main(String[] args) {
		file f1 = new file();
		f1.write();
		f1.read();
		f1.store();
	}

}

