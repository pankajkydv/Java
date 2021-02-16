package AbstractionIntro;

/*There are two ways to achieve abstraction in java
Abstract class (0 to 100%)
Interface (100%)
*/
abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda obj = new Honda(); //bike is created//
//		Bike obj = new Honda(); /* same as Above*/
		obj.run(); //running safely//
		obj.changeGear(); //gear changed//
	}

}
