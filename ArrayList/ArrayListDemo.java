package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(); /*or u can declare by list List<Integer> list=new ArrayList<>();*/
		list.add(454);
		list.add(888);
		list.add(68);
		list.add(78);
		System.out.println(list);
		System.out.println(list.get(2));
	    list.remove(2);
	    System.out.println(list);
	    System.out.println(list.size());
	    List<Integer> list1=new ArrayList<>();
	    System.out.println(list1);
	    System.out.println(list1.size());

	}

}
