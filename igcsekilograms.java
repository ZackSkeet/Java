package HelloWorld1;

import java.util.ArrayList;
import java.util.Scanner;
public class igcsekilograms {
	private static String Sname;
    private String Sweight;


    public igcsekilograms( String name, String weight) {
    
        Sname = name;
        Sweight = weight;
    }
    

    public String getName()
    {
        return Sname;
    }

    public String getAge()
    {
        return Sweight;
    }
    

    public String toString() {
    
        return "name: " + Sname + " age: " + Sweight; 
    }  
    

    public static void main(String[] args) 
    {
       ArrayList<igcsekilograms> students = new ArrayList<igcsekilograms>();
       
       for(int i=0; i < 30; i++) {
       Scanner input = new Scanner(System.in);

               System.out.println("Name: ");
               String name = input.nextLine();
               System.out.println("Weight: ");
               String weight = input.nextLine();
               igcsekilograms student = new igcsekilograms(name, weight);
               students.add(student);
       }
               
    }
}