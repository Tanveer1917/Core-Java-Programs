package com.ExceptionDemos;

import java.util.Scanner;

public class CharacterReplace {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter the string: ");
	        String inputString = scanner.nextLine();

	        // Character to be searched
	        System.out.print("Enter the character to be searched: ");
	        char searchChar = scanner.next().charAt(0);

	        // Character to replace
	        System.out.print("Enter the character to replace: ");
	        char replaceChar = scanner.next().charAt(0);

	        // Perform the replacement
	        String result = replaceCharacter(inputString, searchChar, replaceChar);

	        // Display the result
	        System.out.println("Result: " + result);
	    }

	    private static String replaceCharacter(String inputString, char searchChar, char replaceChar) {
	        // Find the index of the character to be replaced
	        int index = inputString.indexOf(searchChar);

	        // If the character is found, replace it; otherwise, print "character not found"
	        if (index != -1) {
	            // Perform the replacement
	            char[] charArray = inputString.toCharArray();
	            charArray[index] = replaceChar;
	            return new String(charArray);
	        } else {
	            return "Character not found";
	        }
	    }
	}


