package com.ExceptionDemos;
import java.util.Scanner;


public class CourseAvailability {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of courses
	        System.out.print("Enter no of courses: ");
	        int numberOfCourses = scanner.nextInt();

	        // Check if the number of courses is valid
	        if (numberOfCourses <= 0 || numberOfCourses > 20) {
	            System.out.println("Invalid Range");
	            return;
	        }

	        // Input course names
	        System.out.println("Enter course names:");
	        String[] courses = new String[numberOfCourses];
	        for (int i = 0; i < numberOfCourses; i++) {
	            System.out.print("Course " + (i + 1) + ": ");
	            courses[i] = scanner.next();
	        }

	        // Input the course to be searched
	        System.out.print("Enter the course to be searched: ");
	        String searchCourse = scanner.next();

	        // Check if the searched course is available
	        boolean courseAvailable = false;
	        for (String course : courses) {
	            if (course.equalsIgnoreCase(searchCourse)) {
	                courseAvailable = true;
	                break;
	            }
	        }

	        // Display the result
	        if (courseAvailable) {
	            System.out.println(searchCourse + " course is available");
	        } else {
	            System.out.println(searchCourse + " course is not available");
	        }
	    }
	}
