package HelloWorld1;

public class BubbleSort {
	    static void BubbleSort(int[] array) {  
	        int temp = 0;  
	         for(int i=0; i < array.length; i++){  
	                 for(int j = 1; j < (array.length-i); j++) {  
	                          if(array[j-1] > array[j]) {  
	                                 temp = array[j-1];  
	                                 array[j-1] = array[j];  
	                                 array[j] = temp;  
	       }        
	    }  
	}  
}  

	public static void main(String[] args) {
		
	}

}
