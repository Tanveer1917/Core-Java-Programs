package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StateWork {

	public static void main(String[] args) {
		
		
		Map<String,String> map= new HashMap();
		map.put("Maharashtra", "Mumbai");
		map.put("UP", "Lucknow");
		map.put("Karnataka","Banglore");
		map.put("Punjab", "Hariyana");
		map.put("Goa", "Panji");*/
		
		Scanner sc=
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the student State work");
			int roll=sc.nextInt();
			
			System.out.println("Enter the student Name");
			String name=sc.next();
			
			student.put(roll, name);
		}
		
		Set<Entry<String,String>>en =map.entrySet();
		for(Entry<String,String> e:en)
		{
			System.out.println(e.getKey()+" "+"-->"+" "+e.getValue());
		}
		
				
				
		}
	}


