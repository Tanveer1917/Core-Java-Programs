package Arraylist;

import java.util.ArrayList;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		        // Creating an ArrayList of Strings
		        ArrayList<String> fruits = new ArrayList<>();

		        // Adding elements to the ArrayList
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Orange");
		        fruits.add("Mango");

		        // Printing the elements of the ArrayList
		        System.out.println("Fruits in the ArrayList:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }
		    }
		}


