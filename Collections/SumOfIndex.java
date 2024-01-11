package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class SumOfIndex {

	public static void main(String[] args) {
		
		        List<Integer> list = new ArrayList<>();
		        list.add(50);
		        list.add(40);
		        list.add(30);
		        list.add(20);
		        list.add(10);
		       
		        int sumOfOddIndices = calculateSumOfEvenIndices(list);

		        System.out.println("List: " + list);
		        System.out.println("Sum of elements at even indices: " + sumOfOddIndices);
		    }

		    private static int calculateSumOfEvenIndices(List<Integer> list) {
		        int sum = 0;
		        for (int i = 0; i < list.size(); i += 2)
		        {
		            sum += list.get(i);
		        }
		        return sum;
		    }
		}


