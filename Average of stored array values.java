import java.util.Scanner;

public class BSDchallenge4 {


	public static void main(String[] args) {
		
		int value;
	 	int sum = 0;
	    float average;
	    
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of elements you want in the array: ");
	        value = input.nextInt();
	        int array[] = new int[value];
	        
	        System.out.println("Enter all the elements: ");
	        for(int i = 0; i < value ; i++)
	        {
	            array[i] = input.nextInt();
	            sum = sum + array[i];
	        } 
	        
	        System.out.println("Sum: "+ sum);
	        average = (float)sum / value;
	        System.out.println("Average: "+ average);
		
	}

}
