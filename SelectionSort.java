package HelloWorld1;
import java.util.Arrays;

public class SelectionSort {
	 
	public static void main(String[] args) {
		 
		int[] array = {5,4,3,2,1};

		    for (int i = 0; i < array.length - 1; i++) {
		            int index = i;
		              for (int j = i + 1; j < array.length; j++) {
		                  if (array[j] < array[index]) 
		                   index = j;

		            int smallerNumber = array[index];  
		            array[index] = array[i];
		            array[i] = smallerNumber;
		              }
		              System.out.println(Arrays.toString(array));
		      }
	}

}
