package Inheritance;
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");} 
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 obj = new A7();  
		obj.print();  
		obj.show();  
	}

}
