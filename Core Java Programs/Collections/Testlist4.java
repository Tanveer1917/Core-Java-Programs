package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Testlist4 {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks into list");

		for (int i = 0; i < 5; i++) {
			marks.add(sc.nextInt());
		}
		// I want iterate all marks from list
		/*
		 * Iterator is an Interface which is one of the cursor of collection which
		 * provides several methods like boolean
		 * 
		 * 1.boolean hasNext(); 2.Object next(); 3.void remove();
		 * 
		 * we can invoke iterator method by any valid object of collection using
		 * iterator we can not move backward direction
		 * 
		 * Gernerics is best solution for type casting
		 * 
		 */
		Iterator<Integer> itr = marks.iterator();
		while (itr.hasNext()) {
			int m = itr.next();

			if (m >= 90)
				;
		}
		System.out.println(marks);

	}

}
