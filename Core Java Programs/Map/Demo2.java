
package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo2 
{

	public static void main(String[] args) 
	{
		Map<Integer,String>studentDetails=new HashMap();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the student roll number");
			int roll=sc.nextInt();
			
			System.out.println("Enter the student Name");
			String name=sc.next();
			
			studentDetails.put(roll, name);
		}
		
		//Iterating map using iterator
		//set<k>keySet();
		
		Set<Integer>setOfKeys=studentDetails.keySet();
		Iterator<Integer> itr=setOfKeys.iterator();
		
		while(itr.hasNext());
		{
			int rno=itr.next();
			//V get (Object key)
			String name=studentDetails.get(rno);
			
			System.out.println(rno+"---->"+" "+name);
		}
		

	}

}
