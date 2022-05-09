package Assignments;

public class Assignment2 {

	public static void main(String[] args) {

		int a=0;
		int b=1;

		int num = 10;
		System.out.println("Fibonacci Series till " + num + " terms:");
		for (int i=0;i<=num;i++) {

			System.out.print(a + ", ");

			int c = a+b;
			a=b;
			b= c;
		}
	}
}
