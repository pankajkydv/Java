package Inheritance;

class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating object
		Dog c = new Dog();
		c.bark();//barking
		c.eat();//eating
	}

}
