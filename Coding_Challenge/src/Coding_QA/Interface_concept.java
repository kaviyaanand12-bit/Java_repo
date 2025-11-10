package Coding_QA;

interface playable {
	void play();
}

class guitar implements playable{

	@Override
	public void play() {
		System.out.println("playyying guitar");
	}
	
}
class piano implements playable{

	@Override
	public void play() {
		System.out.println("playying piano");
	}

}
public class Interface_concept {

	public static void main(String[] args) {
		guitar g1 = new guitar();
		g1.play();
		piano p1 =  new piano();
		p1.play();

	}

}
