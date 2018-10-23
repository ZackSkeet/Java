package HelloWorld1;

import java.util.Scanner;

public class BinarySearch {
	private static Scanner input1;
	static int BinarySearch(int[] Array, int value, int low, int high) {
	    int middle = (low + high) / 2;
	         
	    if (high < low) {
	        return -1;
	    }
	 
	    if (value == Array[middle]) {
	        return middle;
	    } else if (value < Array[middle]) {
	        return BinarySearch(Array, value, low, middle - 1);
	    } else {
	        return BinarySearch(Array, value, middle + 1, high);
	    }
	}
	public static int getIndexOfMax(int array[]) {
	    if (array.length == 0) {
	        return -1; // array contains no elements
	    }
	    int max = array[0];
	    int pos = 0;

	    for(int i=1; i<array.length; i++) {
	        if (max < array[i]) {
	            pos = i;
	            max = array[i];
	        }
	    }
	    return pos;
	}
	public static int getIndexOfMin(int array[]) {
	    if (array.length == 0) {
	        return -1; // array contains no elements
	    }
	    int min = array[0];
	    int pos = 0;

	    for(int i=1; i<array.length; i++) {
	        if (min > array[i]) {
	            pos = i;
	            min = array[i];
	        }
	    }
	    return pos;
	}
	public static void main(String[] args) {
		int[] array = {1,2,5,7,15,23,45,67};
		input1 = new Scanner(System.in);
	 	System.out.println("please enter the item you want to search in integer form: ");
	 	int search = 0;
	 	search = input1.nextInt();
		
		int result = BinarySearch(array, search, getIndexOfMax(array), getIndexOfMin(array));
		
		if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element has been found at the index position: " + result);
		
	}
}
