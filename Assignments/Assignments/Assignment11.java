package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment11 {

	public static void main(String[] args) {

		ArrayList mncs = new ArrayList<>();
		mncs.add("Capgemini");
		mncs.add("Infosys");
		mncs.add("TCS");
		System.out.println("ArrayList of mncs: " +mncs);

		String[] arr = new String[mncs.size()];

		mncs.toArray(arr);
		System.out.print("Array: ");
		for(String item:arr) {
			System.out.print(item+", ");

		}

		String[] array = {"Capgemini","Infosys","TCS"};
		System.out.println("Array: " + Arrays.toString(array));

		List strmncs= new ArrayList<>(Arrays.asList(array));

		System.out.println("List: " + strmncs);
	}
}
