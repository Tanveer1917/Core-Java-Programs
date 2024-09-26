package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestList3 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		list1.add(100);
		list1.add(1);
		list1.add(8);
		list1.add(10);
		System.out.println(list1);
		
		List<Integer>list2=new ArrayList();
		list2.add(100);
		list2.add(11);
		list2.add(81);
		list2.add(10);
		System.out.println(list2);
		
		
		
		/* I want to fetch common integer objects from both list
		 * 
		 * 
		 * boolean retainAll(Collection collection)
		 * The above method invoking or called by using one collection type
		 * object and it is check with parameterized collection type objects 
		 * if parameterized object contained the specific elements which is specific element
		 * which is contained 
		 * by invoking object then those elements or objects will be remain and other will be removed
		 * 
		 * It i s use to implement intersection in collection
		 * 
		 * 
		 * [1,2].reatinAll[1]
		 * 
		 * 
		 * boolean removeAll(Collection collection)
		 * Removes from this list all of its elements that are contined in the specific collection
		 * 
		 * list1.retainAll(list2)
		 */
		list1.removeAll(list2);
		System.out.println(list1);
		
	}
	

	}


