package Assignments;

public class Assignment9 {

	public static void main(String[] args) {  

		int [] numarr = new int [] {12, 34, 7, 13, 33};  
		int max = numarr[0];  
		for (int i = 0; i < numarr.length; i++) {  
			if(numarr[i] > max)  
				max = numarr[i];  
		}  
		System.out.println("Largest element present in given array: " + max);  
	}  
}  



