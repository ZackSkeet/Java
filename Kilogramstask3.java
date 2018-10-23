package HelloWorld1;
import java.util.Scanner;
public class Kilogramstask3 {
	private static String[] studentnames;
	private static String[] studentweights;
	private static String[] endstudentweights;
	private static Scanner sweight;
	private static Scanner sname;
	private static Scanner esweight;
	
	public static void main(String[] args) {
		 studentnames = null;
		 studentweights = null;
		 endstudentweights = null;
		 
		 for(int i=0; i<30; i++) {
			 sname = new Scanner(System.in);
			 System.out.println("please enter a students name: ");
			 String name = sname.next();
			 
			 sweight = new Scanner(System.in);
			 System.out.println("please enter a students weight: ");
			 double dweight = 0.00;
			 dweight = sweight.nextDouble();
			 if (dweight < 120.00) {
				 System.out.println("Invalid student weight");
			 }
			 if (dweight < 19.00) {
				 System.out.println("Invalid student weight");
			 }
		       String weight = Double.toString(dweight);
			
				 esweight = new Scanner(System.in);
				 System.out.println("please enter" + studentnames[i] + "weight");
				 double edweight = 0.00;
				 edweight = esweight.nextDouble();
				 if (edweight > 120.00) {
					 System.out.println("Invalid student weight");
				 }
				 if (edweight < 19.00) {
					 System.out.println("Invalid student weight");
				 }
			       String endweight = Double.toString(edweight);
			       
			 studentnames[i] = name;
			 studentweights[i] = weight;
			 endstudentweights[i] = endweight;
		 }
		 System.out.println(studentnames + " kg");
		 System.out.println(studentweights + " kg");
		 System.out.println(endstudentweights + " kg");
		 
		 double[] doublestartweight = new double[studentweights.length];
		 for (int i=0; i<doublestartweight.length; i++) {
		     doublestartweight[i] = Double.parseDouble(studentweights[i]);
		 }
		 double[] doubleendweight = new double[endstudentweights.length];
			 for (int i=0; i<doubleendweight.length; i++) {
			     doubleendweight[i] = Double.parseDouble(endstudentweights[i]);
			 }
			
			 double[] diff = new double[studentweights.length];
			   
			    for(int g=0; g<studentweights.length; g++) {
			    
			      diff[g] = doublestartweight[g] - doubleendweight[g];
			      
			    }

			    for(int j=0; j<diff.length; j++) {
			    
			    	double difference = doublestartweight[j] - doubleendweight[j];
					  if (difference > 2.5) {
						  if (difference <= 0) {
							  System.out.println(studentnames[j] + "has lost" + difference + "kgs");
							} else {
								System.out.println(studentnames[j] + "has gained" + difference + "kgs");
							}
			    }
					  else {
						  System.out.println("this student has not lost/gained more than 2.5 kgs: " + studentnames[j]);
					  }
	 }

}}