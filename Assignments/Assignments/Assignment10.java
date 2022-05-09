package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment10 {

	
	public static void main(String[] args) {
		
		 List<Integer> list1 = new ArrayList<Integer>();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 

		 List<Integer> list2 = new ArrayList<Integer>();
		 list2.add(4);
		 list2.add(5);
		 list2.add(6);
		 
		 List<Integer> joinedlist = new ArrayList<Integer>();
		 joinedlist.addAll(list1);
		 joinedlist.addAll(list2);
		 
		 System.out.println("List 1: " +list1);
		 System.out.println("List 1: " +list2);
		 System.out.println("JoinedList : " +joinedlist);


		 
		 
	}
}
