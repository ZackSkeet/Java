public class BSDchallenge6 {
	public static void main(String[] args) {
	int[] array = {6,4,3,2,1};
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i=0; i<array.length; i++)
	{
	    if(array[i] < min)
	       min = array[i];
	    if(array[i] > max)
	       max = array[i];
	}
	
	System.out.println("the maximum value is: " + max + "and the minimum value is " + min);
	
	}
}
