// Temperature Conversion

import java.util.Scanner;

public class TemperatureConversion
{
public static void main( String [] args )
{
   // Constants 
	float f, c;
	f = 0;
	c = 0;
			
	// Converting f to c
	    Scanner scan = new Scanner (System.in);
	    System.out.println("Please enter degrees F");
	    f = scan.nextFloat();
	    c = (5* (f - 32)) / 9f;
	    System.out.println(f + " degrees F is " + c + " in degrees C");
	  // Converting c to f
	    Scanner scan1 = new Scanner (System.in);
	    System.out.println("Please enter degrees C");
	    c = scan1.nextFloat();
	    f = (9 * c + 160) / 5f;
	    System.out.println(c + " degrees C is " + f + " in degrees F");
	    }	

				
}
 
