package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet();
		set1.add(500);
		set1.add(100);
		set1.add(1);
		set1.add(345);
		set1.add(12);
		set1.add(1);
		set1.add(null);
		set1.add(null);

		System.out.println(set1);
		List<String> listofCandidates = new ArrayList();

		listofCandidates.add("D");
		listofCandidates.add("F");
		listofCandidates.add("Java");
		listofCandidates.add("android");
		listofCandidates.add("Dev");

		HashSet set2 = new HashSet(listofCandidates);
		System.out.println(set2);

		HashSet set3 = new HashSet(30);
		HashSet set4 = new HashSet(50, 0.24f);

	}

}
