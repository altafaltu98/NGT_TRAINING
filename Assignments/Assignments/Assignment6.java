package Assignments;
import java.util.Arrays;

public class Assignment6 {

	public static void main(String[] args) {
		
		int[] array1= {1, 2, 3, 4};
		int[] array2= {5, 2, 3, 4};
		
		int lengtharray1 = array1.length;
		int lengtharray2 = array2.length;
		
		int[] result = new int[lengtharray1 + lengtharray2];
		
		System.arraycopy(array1, 0, result, 0, lengtharray1);
		System.arraycopy(array2, 0, result, lengtharray1, lengtharray2);
		
		System.out.println(Arrays.toString(result));
	}
	
	
	
}
