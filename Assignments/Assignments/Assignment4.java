package Assignments;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		int[] array = { 10, 20, 30, 40, 50, 60};
		 int sum = 0;
		 
		 for(int num:array) {
			 sum+=num;
		 }
		 
		 int average = sum/array.length;
		 System.out.println("the average is: " + average);
		 
		
	}

}
