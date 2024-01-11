package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* LinkedList class Internally uses doubly linked list data structure
 * 
 * LinkedList provides a flexible way to fetch data
 * using methods like
 * 
 * like in doubly linked list
 * 
 * [prev][data][next]<---->[prev][data]
 * 
 * i.addFirst(Object Obj)
 * ii.addLast(Object Obj)
 * iii.removeFirst(Object Obj)
 * iv.removeLast()
 * v.getFirst()
 * vi.getLast()
 * 
 * Difference between ArrayList and LinkedList
 * 
 * 1.ArrayList uses dynamic array data structure but linkedList
 * uses doubly linked list data structure 
 * 
 * ii.ArrayList is effiecient for storing bulk amount of data but arrayList is NOT efficient to remove large amount of data 
 *  but ArrayList is NOT  efficient to remove large amount of data 
 *  because in ArrayList bit need to shifted once we remove any object 
 *  but in case of LinkedList is more efficient for modification 
 *  
 * 
 * 
 */

public class TestDemo1 {

	public static void main(String[] args) {
		
		//How to create object of linkedList
		//way -1
		/*
		 * List
		 * ---arrayList
		 * ---LinkedList
		 * ---Stack
		 * ----Vector
		 * 
		 * 
		 * 
		 * 
		 */
		List list=new LinkedList();
		
		//way2
		//Here we are creating LinkedList object by invoking 
		//LinkedList()
		//and initializing that object into LinkedList reference
		
		LinkedList list2=new LinkedList();
		
		//way 3
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(40);
		
		//way 3
		//we are creating LinkedList object by invoking 
		//LinkedList ()
		//and intializing  that object 
		
		LinkedList list3=new LinkedList(a1);
		a1.add(1);
		a1.add(40);
		
	}

}
