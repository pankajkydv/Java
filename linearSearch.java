package Searching;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 56, 3, 249, 518, 7, 26, 94, 651, 23, 9 };
		int element = 26;
		int index = linearSearch(arr, element);
		System.out.println("The index of given no " + element + " is " + index);
	}

	public static int linearSearch(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
