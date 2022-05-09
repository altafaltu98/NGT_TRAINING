package Assignments;

public class Assignment8 {

	
	public static void main(String[] args) {
		
		int[] numarray = {1, 2, 3, 4};
		int find = 2;
		boolean found = false;
		
		for(int n:numarray) {
			if(n==find) {
				 found = true;
				 break;
			}
			
		}
		if(found) {
			System.out.println("array contains number: " +find);
		}
		else
			System.out.println("array does not contain: " +find);
	}
}
