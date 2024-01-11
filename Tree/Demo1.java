package com.Tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		/*
		 * Tree Set is one of the valid implementation class of Set interface 
		 * TreeSet class stored objects in natural order or ASC order
		 * TreeSet does not allow duplicacy 
		 * TreeSet provides three constructors:
		 * TreeSet()
		 * ---->If we create object of TreeSet with default constructor then internally it called compare
		 * int compareTo(Object obj) of Comparable iinterface to compare both object with defaultand parameterized 
		 * object based on the comparsision it sorts the objects of Collection or Set 
		 * 
		 * all wrapper classes,String,StringBuffer by default elements 
		 * Comparable interface 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Set<Integer>set1=new TreeSet();
		
		set1.add(100);
		set1.add(20);
		set1.add(1);
		System.out.println(set1);
		
		Set<String> names=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the five candidate Names");
		
		for(int i=0;i<5;i++)
		{
			String n=sc.next();
			names.add(n);
		}
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
