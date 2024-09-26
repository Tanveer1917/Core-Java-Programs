package LinkedList;

import java.net.Inet4Address;
import java.util.LinkedList;

public class TestDemo2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1=new LinkedList();
		
		list1.add(100);
		list1.add(40);
		list1.addFirst(1);
		list1.addLast(108);
		
		//printing first and last object
		
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		
		//remove first element 
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());

	}

}
