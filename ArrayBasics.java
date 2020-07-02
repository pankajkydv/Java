package ArrayIntro;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**********1-D ARRAY********");
//		Method 1 To Create array
		int[] arr1;
		arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		String[] ARR;
		ARR = new String[4];
		ARR[0] = "pankaj";
		ARR[1] = "nikhil";
		System.out.println(ARR);
		System.out.println(ARR[0]);
		System.out.println(ARR[3]);
		System.out.println(arr1);
		System.out.println(arr1[2]);
//		Method 2 To Create array
		int[] arr2 = new int[2];
		arr2[0] = 3;
		arr2[1] = 4;
		System.out.println(arr2[1]);
//		Method 3 To Create Array
		int[] arr3 = new int[] { 1, 2, 3 };
		System.out.println(arr3[2]);
//		method 4 to create array
		int[] arr4 = { 5, 6, 8, };
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);

		System.out.println("**************Enter inputs for 1-D array******");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr5 = new int[n];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = s.nextInt();
		}
		System.out.println("**********Accessing 1=D ARRAY***********");
		for (int val : arr5) {
			System.out.println(val);
		}

		System.out.println("**************2-D ARRAY************");
//		Similar To 1D ARRAY as we create above
		int[][] array = new int[2][];
		System.out.println(array);
		System.out.println(array[1]);
		int[][] A = new int[3][2];
		System.out.println(A[0]);
		System.out.println(A[0][1]);
		int[][] B = new int[3][];
		B[0] = new int[4];
		B[2] = new int[3];
		System.out.println(B[0]);
		System.out.println(B[1]);
		System.out.println(B[2][0]);
//		System.out.println(B[1][0]); Null point exception error
		System.out.println("**************Enter inputs for 2-D array******");
		int p = s.nextInt();
		int q = s.nextInt();
		int[][] arr6 = new int[p][q];
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				arr6[i][j] = s.nextInt();
			}
		}
		System.out.println("**********Accessing 2-D ARRAY***********");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				System.out.println(arr6[i][j]);
			}
		}
		System.out.println("***********Arrays Swapping***********");
  int []other1= {10,20,30,40,50};
  int [] other2= {60,70,80,90,100};
	System.out.println("before Swapping "+other1[0]+" "+other2[0]);
  swap(other1,other2);
	System.out.println("After Swapping "+other1[0]+" "+other2[0]);
	System.out.println("*************Another method to take input of 1D array*******");
	int []result=takeinput();
	display(result);
	}
	public static void swap(int[]one,int[]two) {
		int[]temp=one;
		one=two;
		two=temp;
		
	}
	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array ?");
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value at index "+i);
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void display(int[]arr) {
		for(int val:arr) {
			System.out.println(val);
		}
	}
	

}
