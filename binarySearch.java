package Searching;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 9 };
		int element =23 ;
		int index = binarySearch(arr, element);
		System.out.println("The index of given no " + element + " is " + index);
	}

	public static int binarySearch(int[] arr, int element) {
		int start = 0, end = arr.length - 1;
	
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
