package ExceptionHandling;

import java.util.Scanner;

public class studentclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);

		student s = new student();
		System.out.println("******Enter your name******");
		String name = t.nextLine();

		try {
			s.setName(name);
			System.out.println("hello " + name);

		}
// try & catch are used to stop the termination of code if declare dangerous function then code will terminate & rest of code can't run
		catch (Exception e) {
			System.out.println("name is invalid(catch block)");

		}
		System.out.println("**********Enter your age*****");
		int age = t.nextInt();
		try {
			s.setAge(age);
		} catch (Exception e) {
			System.out.println("age cant be negative (catch block)");

		}

		System.out.println("Your name is " + s.getName());
		System.out.println("Your age is " + s.getAge());
		System.out.println("bye");

	}

}
