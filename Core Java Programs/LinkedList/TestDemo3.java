package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		
		
		/*First Five character upper case a;phabet
		 * 
		 * next four character should be digit()
		 * last two character uppercase alphabets
		 * 
		 * 
		 */

		LinkedList<String> list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of Pan cards");
		int nop = sc.nextInt();
		
		for (int i = 0; i < nop; i++) {
			System.out.println("enter the Pan Number of "+" "+(i+1)+"customer");
			String pNum=sc.next();
			list.add(pNum);
			

		}
		
		/*
		 * In new version of Collection(1.5) then added two more cursor in collection 
		 * 
		 * 1.Enumerator 
		 * 2.Iterator
		 * Iterator can apply with all type of collection(List,Set,Queue)
		 * Iterator having methods only three methods 
		 * like
		 * a.boolean hasNext()
		 * b.Object next()
		 * c.void remove()
		 * 
		 *  
		 *  Iterator can only iterate the list in forward position 
		 * 3.ListIterator
		 * 
		 * ListIterator caan apply only with list type of Collection 
		 *Using ListIterator we can iterate a list in both forward and backward position 
		 *
		 * Methods in ListIterator are :
		 * 
		 * 1.boolean hasNext()
		 * 2.Object next()
		 * 3.void remove()
		 * 4.booleanhasPrevious()
		 * 5.Object previous()
		 * 6.int indexOf(Object obj
		 * 7.int previousIndex()
		 * 
		 */
		ListIterator<String> itr= list.listIterator();
		while(itr.hasNext())
		{
		    String  nextObject=itr.next();
			System.out.println(nextObject);
			
		}
		System.out.println("Printing in backward Direction");
		
		while(itr.hasPrevious())
		{
			
			//Object next()
			//String nextObject=(String)itr,next();
			
		    String  prevObject=itr.previous();
			System.out.println(prevObject);
			
			
		}

	}

}

