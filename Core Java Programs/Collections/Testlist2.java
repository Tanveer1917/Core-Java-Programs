
package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Testlist2 {
	public static void main(String[] args)
	{
		
		
		List<Integer> listOfNum=new ArrayList();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int n=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
		System.out.println("enter"+" "+(i+1)+ " "+"number");
		int num=sc.nextInt();
		listOfNum.add(num);
		
		}
		System.out.println(listOfNum);
		Object[] objArray= listOfNum.toArray();
		for(int i=0;i<objArray.length;i++)
		{
			System.out.println(objArray[i]);
		}
		Integer[] arr= {12,34,67,89,90};
		
		//converting into list by invoking List Arrays.asList(arrayObject)
		List<Integer> listOfNum2= Arrays.asList(arr);
		System.out.println(listOfNum2);
		
		
		//now combining both list into a single list or implementing union op
		//It is used to merger two collection one is parameterized collection
		//Second one is invoking collection object
		List<String>list3=new ArrayList();
		
		
		
		listOfNum.addAll(listOfNum2);
		System.out.println("after union list"+" "+listOfNum);
	}

}
