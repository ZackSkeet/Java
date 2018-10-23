package HelloWorld1;

import java.util.Arrays;
import java.util.Scanner;

public class BSDchallenge2 {
	private static Scanner input1;
	
	public static void main(String[] args) {
		input1 = new Scanner(System.in);
	 	System.out.println("please enter a word: ");
	 	String palindrome = input1.toString();
	 	
	 	
	 	
		char[] a = palindrome.toCharArray();
	        char[] r = reverseArray(a);
	        
	        System.out.println(Arrays.toString(a));
	        System.out.println(Arrays.toString(r));


	}

	private static char[] reverseArray(char[] b) {
		char[] c = new char[b.length];
		for (int i=b.length-1, j=0; i>=0; i--, j++) {
		    
		    c[j] = b[i];
		}
		return c;
	}

}
