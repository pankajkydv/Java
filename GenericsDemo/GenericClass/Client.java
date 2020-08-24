package GenericsDemo.GenericClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Generic Class
		Pair<String> pair = new Pair<>();
		pair.one = "pankaj";
		pair.two = "nikhil";

		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 4;
		pair1.two = 9;
		System.out.println(pair.one);
		System.out.println(pair.two);
		System.out.println(pair1.one);
		System.out.println(pair1.two);
		System.out.println("***************************");
		Pair2<String, Integer> pair2 = new Pair2<>();
		pair2.one = "apple";
		pair2.two = "mango";
		pair2.three = 45;
		pair2.four = 445;
		System.out.println(pair2.one);
		System.out.println(pair2.two);
		System.out.println(pair2.three);
		System.out.println(pair2.four);
		System.out.println("***************************");
		// Array List
		ArrayList<String> pair3 = new ArrayList<>();
		pair3.add("merceds");
		pair3.add("bmw");
		System.out.println(pair3);
		System.out.println("***************************");
		// List
//List<Integer>pair4 =new ArrayList<>();
		List<Integer> pair4 = new LinkedList<>();
		pair4.add(6);
		pair4.add(6);
		pair4.add(66);
		pair4.add(8526);
		pair4.add(5545);
		System.out.println(pair4);
		System.out.println("***************************");
		// Linked list
		LinkedList<String> pair5 = new LinkedList<>();
		pair5.add("a");
		pair5.add("b");
		pair5.add("c");
		pair5.add("d");
		pair5.add("e");
		pair5.add("f");
		pair5.add("g");
		System.out.println(pair5);
		System.out.println(pair5.getFirst());
		System.out.println(pair5.getLast());
		System.out.println(pair5.get(1));
		System.out.println(pair5.indexOf("d"));
		System.out.println(pair5.lastIndexOf("g"));
		System.out.println(pair5.remove("g"));
		System.out.println(pair5.remove(5));
		System.out.println(pair5.removeAll(pair5));
		System.out.println(pair5.remove(pair5));
		System.out.println(pair5);

		System.out.println("***************************");
//     Generic LinkedList
		LinkedListGeneric<Car> list = new LinkedListGeneric<>();
		Car[] cars = new Car[5];
		cars[0] = new Car(100, 200, "black");
		cars[1] = new Car(500, 250, "red");
		cars[2] = new Car(700, 500, "orange");
		cars[3] = new Car(800, 60, "white");
		cars[4] = new Car(400, 90, "green");
		list.AddLast(cars[0]);
		list.AddLast(cars[1]);
		list.AddLast(cars[2]);
		list.AddLast(cars[3]);
		list.AddLast(cars[4]);
		list.display();

	}

}
