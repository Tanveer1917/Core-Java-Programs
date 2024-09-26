package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CallByValue {

	public static void main(String[] args) {
		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(1);
		        numbers.add(2);
		        numbers.add(3);

		        System.out.println("Before calling modifyList method: " + numbers);

		        modifyList(numbers);

		        System.out.println("After calling modifyList method: " + numbers);
		    }

		    private static void modifyList(List<Integer> list) {
		        // Modifying the list inside the method
		        list.add(4);
		        list.remove(0);
		        // Note: The changes made to the list inside this method will affect the original list
		    }
		

}


