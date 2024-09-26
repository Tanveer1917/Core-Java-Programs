
package com.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args)
	{
		HashSet<Double>hs=new HashSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Element into Set");
		
		for(int i=0;i<5;i++)
		{
			double salary=sc.nextDouble();
			hs.add(salary);
		}
		System.out.println(hs);
		
		System.out.println("Iterate HashSet using for each loop");
		for(double sal:hs)
		{
			System.out.println(sal);
		}
		
		/*
		 * I want to sort the element of hashset
		 * 
		 * List<double> list=new ArrayList(hs);
		 * 
		 */
		
		List<Double> list=new ArrayList(hs);
		Collections.sort(list);
		System.out.println(list);
	}

}
