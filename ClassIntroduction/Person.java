package ClassIntroduction;

public class Person {

		// TODO Auto-generated method stub
 private String name;
private int age;

public Person() {
	System.out.println("i am a default constructor");
}
public Person(String name){
	System.out.println(" i am constructor with one parametr");
	this.name=name;
}
public Person(String name,int age) {
	System.out.println("i am a constructor with two parameter");
	this.name=name;
	this.age=age;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return this.age;
}

public void setAge(int age) {
	this.age = age;
}
}