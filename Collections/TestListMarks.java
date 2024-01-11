package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestListMarks {

	private static final String index = null;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
       	List<Integer> marksList = new ArrayList<>();
		System.out.println("Enter marks for students");
		
		int i=0;
		while(i<5)
		{
			System.out.print("Enter marks ");
		int 	marks = scanner.nextInt();//20//50//45//32//31
			marksList.add(marks);
			i++;
		}

	
		Iterator<Integer> iterator = marksList.iterator();
		while (iterator.hasNext()) {
			int currentMarks =iterator.next();
			if (currentMarks >= 30 && currentMarks < 34) {
				//iterator.remove();
				//set(int index,object)
			marksList.set(marksList.indexOf(currentMarks), currentMarks+5);
			}
		}
System.out.println(marksList);
	
        
		int totalMarks = 0;
		for (int mark : marksList) {
			totalMarks += mark;
		}
		System.out.println(totalMarks);

		Collections.sort(marksList);
		System.out.println("Sorted Marks: " + marksList);

	  
		
		
		int index1=0;
		while(index1<marksList.size())
		{
		
		if (marksList.get(index1) >= 90 && marksList.get(index1) <= 100) {
			System.out.println("Grade: O");
		} else if (marksList.get(index1)>= 80 && marksList.get(index1) <= 90) {
			System.out.println("Grade: E");
		} else if (marksList.get(index1)>= 70 && marksList.get(index1) <=80) {
			System.out.println("Grade: A");
		} else if (marksList.get(index1)>= 60 && marksList.get(index1) <=70) {
			System.out.println("Grade: B");
		} else if (marksList.get(index1) >= 50 && marksList.get(index1) <=60) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Your Fail the Exam");
		}
		index1++;
		}
	}

}

/*write
 * 
 * List
 * 
 */
