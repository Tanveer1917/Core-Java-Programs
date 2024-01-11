package com.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo3 {

	public static void main(String[] args) {

		Set<Integer> setOfNumbers = new LinkedHashSet();

		setOfNumbers.add(100);
		setOfNumbers.add(1);
		setOfNumbers.add(8);
		setOfNumbers.add(10);
		setOfNumbers.add(90);

		System.out.println(setOfNumbers);
		
		/*
		 * using set type of refence or nay valid Hashset type
		 * LinkedHashSet type of TreeSet type we can  not invoke the following 
		 * meethods of Collections
		 * get(int index)--Object
		 * set(in tindex,Object obj)---void 
		 * indexOf(Object obj)--int
		 * 
		 */
		List<Integer>list=new ArrayList(setOfNumbers);
		
		for(int i=0;i<list.size();i++)
		{
			int value=list.get(i);
			System.out.println(value);
		}
		System.out.println("iterting using iterator");
		java.util.Iterator<Integer>itr=   setOfNumbers.iterator();
		
		while(itr.hasNext())
		{
			int res=itr.next();
			System.out.println(res);
		}
	}

}
