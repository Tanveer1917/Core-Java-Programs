package com.Vector;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
	
		//cretating the object of vector
		/*
		 * Vector()--capacity 10
		 * Vector(collection collection)
		 * Vector (int capacity)
		 * Vector(int capacity,int increament)
		 * 
		 */
		
		Vector v=new Vector(5,15);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter"+" "+(i+1)+" "+"element");
			int element=sc.nextInt();
			v.add(element);
		}
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		Enumeration<Integer>e=v.elements();
		 
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
