import java.util.Arrays;
import java.util.Scanner;

public class BSDchallenge5 {

	public static void main(String[] args) {
		int value;
		int element;
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        value = input.nextInt();
        int array[] = new int[value];
        
        System.out.println("Enter all the elements: ");
        for(int i = 0; i < value ; i++) {
            array[i] = input.nextInt();
        } 
        
        
        System.out.println("Enter the element you want: ");
        element = input.nextInt();
        
        Arrays.sort(array);
        
        boolean Elementwanted = false;
	    for (Integer number : array) {
	        if (number.equals(element)) {
	        	Elementwanted = true;
	        	int elements[] = null;
	        	int count = 0;
	        	if (	Elementwanted = true) {
	        	for (int i = 0; i < array.length; i++) {
	        	     for (element = i + 1 ; element < array.length; element++) {
	        	          if (array[i] == elements[element]) {
	        	        	  count = count + 1; 
	        	        	  System.out.println("Duplicated: " + count + "The element you searched for:" + element);
	        	          }
	        	     }
	        	 }
	        	}
	                }
	            }
	        }
	}


