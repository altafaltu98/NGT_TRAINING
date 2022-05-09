package Assignments;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
	    System.out.println("Enter number");

	    int num = scan.nextInt();  
	    System.out.println("number is: " + num);
		
		//int num = 11;
		if(num%2==0) {
			System.out.println(" not prime");
		}
		else
		{
			System.out.println(" prime");
		}
	}}