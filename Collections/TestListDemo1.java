package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TestListDemo1 {

	public static void main(String[] args) {
		
		
		//List is a collection type which allow duplicacy 
		//List is store objects in insertion order or index order
		//List having 
		//ArrayList ia a class which uses dynamic array or growable array that means the size of this array 
		//can be automatically reallocated
		
		List list1=new ArrayList();
		
		//adding objects into list
		
		list1.add("ABC");
		list1.add(new Double(3546.00));
		list1.add(100);
		list1.add(true);
		list1.add(new Integer(108));
		
		//checking size of the list
		//int size()
		
		int listSize=list1.size();
		System.out.println(listSize);
		
		//I want check whether my list conating a string object called ABC or XYZ
		
		for(int i=0;i<list1.size();i++)
		{
			//object get(int index)
			Object obj=list1.get(i);
			System.out.println(obj);
			
		}
		
		if(list1.contains("ABC"))
		{
			System.out.println("yes it is present");
		}
		
		
		System.out.println();
		
		
		
	   /* ArrayList List2=new ArrayList();
	    
	    List2=new Vector();
	    List2=new Stack();
	    List2=new LinkedList();
	    
	    
	    Collection List3=new ArrayList();
	    
	    List3=new HashSet();
	    List3=new LinkedHashSet();
	    List3=new TreeSet();*/
	    
	    
	    
		
		

	}

}
