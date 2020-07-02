package Sorting;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int busHeight=s.nextInt();
		int nob=s.nextInt();
		int result;
		int []arr=new int[nob];
		for(int i=0;i<nob;i++) {
			arr[i]=s.nextInt();
		
//			 System.out.println(result+"");
		}
		 result=	bus(arr,busHeight);
		
if(result==arr.length) {
	System.out.println("Will not crash");
}
else {
	System.out.println("Will crash on bridge at "+result);
}
	
	

	}
	public static int bus(int[]arr,int busHeight) {
		for( int i = 0;i<arr.length;i++) {
			if(arr[i]<=busHeight) {
				return i+1;
			}
		}
		return arr.length;
		
	}

}
