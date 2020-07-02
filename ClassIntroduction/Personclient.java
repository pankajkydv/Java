package ClassIntroduction;

public class Personclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person("deppak");
		Person p4=new Person("krish", 15);
//		class memberers are private
//		 System.out.println(p3.name);
//       System.out.println(p4.name);
//		 System.out.println(p1.name);
//		 System.out.println(p1.age);
//		 
//		 p2.name="pankaj";
//         p2.age=21;
//		 System.out.println(p2.name);
//		 System.out.println(p2.age);

		 System.out.println(p1.getName());
		 System.out.println(p1.getAge());
		 
		 p2.setName("pankaj");
		 p2.setAge(21);
		 System.out.println(p2.getName());
		 System.out.println(p2.getAge());
		 
		 System.out.println(p3.getName());
		 System.out.println(p4.getName());
		 System.out.println(p4.getAge());
		 
	 
	}

}

