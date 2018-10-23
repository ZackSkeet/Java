import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class AllPrimes {
private static Scanner input1;
private static Scanner input2; 

public static void betweenPrime(int first, int second) {
	List<Integer> storage = new ArrayList<Integer>();

	int n = first;
	for(n = first; n <= second; n++) {
	boolean isPrime = true;
	for(int divisor = 2; divisor <= second / 2; divisor++) {
	    if (second % divisor == 0) {
	        isPrime = false;
	        }
	        if (isPrime) {
	        storage.add(n);
	        }
	 }
	 System.out.println("Here are all the primes between your 2 numbers: " + storage);
	}
}



public static void main(String[] args) {
 	input1 = new Scanner(System.in);
 	System.out.println("please enter an interger: ");
 	int firstprime = 0;
 	firstprime = input1.nextInt();

	
 	input2 = new Scanner(System.in);
    System.out.println("please enter an interger: ");
    int secondprime = 0;
    secondprime = input2.nextInt();
betweenPrime(secondprime, firstprime);
}


}
