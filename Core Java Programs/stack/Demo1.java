package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {
		
		Stack stack=new Stack();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int num=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the values");
			int val=sc.nextInt();
			stack.push(val);
			
		}
		
		System.out.println(stack);
		
	/*	Stack<Integer> stack=new Stack();
		
		
		
		
		//object push(Object obj)
		stack.push(100);
		stack.push(20);
		stack.push(1);
		stack.push(50);
		
		//Object pop()-remove the elements from top of the stack
		/*int value1=stack.pop();
		System.out.println(value1);
		
		int value2=stack.pop();
		System.out.println(value2);
		
		int value3=stack.pop();
		System.out.println(value3);*/
		
		//System.out.println(stack.size());
		//System.out.println(stack.capacity());
	}

}
