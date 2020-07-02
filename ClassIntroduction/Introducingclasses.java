package ClassIntroduction;

//A Simple Class
class Box {
	double width;
	double height;
	double depth;
	Box(){
		this.width=1;
		this.height=2;
		this.depth=3;
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume() {
				return width*height*depth;
	}
	Box(Box o) {
		this.width=o.width;
		this.height=o.height;
		this.depth=o.depth;
	}
}

public class Introducingclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box(15,20,10);
		Box mybox2 = new Box(3,6,9);
		Box mybox3=new Box();
		Box mybox4=new Box(mybox2);
		
		double vol;
		System.out.println(mybox1); /* Shows memory location of mybox1 */
//// assign values to mybox1
//		mybox1.width = 10;
//		mybox1.height = 20;
//		mybox1.depth = 15;
////assign values to mybox2
//		mybox2.width = 3;
//		mybox2.height = 6;
//		mybox2.depth = 9;
//// compute volume for mybox1
//		vol = mybox1.width * mybox1.height * mybox1.depth;
//		System.out.println(vol);
////compute volume for mybox1
//		vol = mybox2.width * mybox2.height * mybox2.depth;
//		System.out.println(vol);
		
		 System.out.println( mybox1.volume());
		 System.out.println( mybox2.volume());
		 System.out.println(mybox3.volume());
		 System.out.println(mybox4.volume());
			
		
	}
}