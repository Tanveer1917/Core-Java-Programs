package LinkedList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TestPan {

	
	
	
		/*
		 * First five character upper case alphabet
		 * next four character should be digit
		 * last two  character uppercase alphabets
		 * 
		 * 
		 * 
		 */
		public static ArrayList<String>
		getOnlyValidPan(LinkedList<String> panList)
		{
			String panCriteria="[A-Z]{5}[0-9]{4}[A-Z]{1}";
			ArrayList<String> al=new ArrayList();
			
			for(int index=0; index<panList.size();index++)
			{
				//fetching one one string object from list
				String panNum=panList.get(index);
				if(panNum.matches(panCriteria))
				{
					al.add(panNum);
				}
				
			}
			return al;
		}
		

		public static void main(String[] args) {
			
			LinkedList<String> list=new LinkedList();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter no of PAN cards");
			int nop=sc.nextInt();
			for(int i=0; i<nop; i++)
			{
				System.out.println("enter PAN number of"+" "+(i+1)+ "customer");
				String pNum=sc.next();
				list.add(pNum);
			}
			//calling the method
			System.out.println("This is valid Number");
			ArrayList<String> res= getOnlyValidPan(list);
			System.out.println(res);
			/*
			 * In new version of the collection (1.5) then added two more cursor in collection
			 * 
			 * 1.Enumerator
			 * 2.Iterator
			 *   Iterator can apply with all type of collection (List , Set ,Queue)
			 *   Iterator having only three method 
			 *   like
			 *   a.boolean hasNext()
			 *   b.Object next()
			 *   c.void remove()
			 *   
			 *   Iterator can only iterator the list in forword position 
			 *  3.ListIterator
			 *  ListIterator can apply only with list type of Collection
			 *  Using ListIterator we can iterator a list in both forward and backword position 
			 *  
			 *  Method in ListIterator are:-
			 *  i)boolean hasNext()
			 *  ii)Object next()
			 *  iii)void remove()
			 *  iv)booleaan hasPrevious
			 *  v)Object previous
			 *  vi)int nextIndex()
			 *  vii)int previousIndex()
			 *  
			 */
		
			//generic to using type casting <String>
		/*	System.out.println("printing in forword direction");
		ListIterator<String> itr=	list.listIterator();	
		while(itr.hasNext())
		{
			//Object next()
			//String nextObject=(String)itr.next();
			String nextObject=itr.next();
			System.out.println(nextObject);
		
		}
			
			System.out.println("printing the backword direction");
			
			while(itr.hasPrevious())
			{
				//Object next()
				//String nextObject=(String)itr.next();
				String prevObject=itr.previous();
				System.out.println(prevObject);
			}*/


		}

	}