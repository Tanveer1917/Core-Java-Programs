package com.Collections;

import java.util.ArrayList;
import java.util.List;


public class CandidateCount {

	public static void main(String[] args) {
		
		
		        List<String> listOfCandidates = new ArrayList<>();
		        listOfCandidates.add("Mr.A");
		        listOfCandidates.add("Mr.B");
		        listOfCandidates.add("Mrs.C");
		        listOfCandidates.add("Mrs.T");

		        int numberOfMaleCandidates = countMaleCandidates(listOfCandidates);
		        List<String> femaleCandidates = getFemaleCandidates(listOfCandidates);

		        System.out.println("List of Candidates: " + listOfCandidates);
		        System.out.println("Number of Male Candidates: " + numberOfMaleCandidates);
		        System.out.println("List of Female Candidates: " + femaleCandidates);
		    }

		    private static int countMaleCandidates(List<String> candidates) {
		        int count = 0;
		        for (String candidate : candidates) {
		            if (candidate.startsWith("Mr.")) {
		                count++;
		            }
		        }
		        return count;
		    }

		    private static List<String> getFemaleCandidates(List<String> candidates) {
		        List<String> femaleCandidates = new ArrayList<>();
		        for (String candidate : candidates) {
		            if (candidate.startsWith("Mrs.")) {
		                femaleCandidates.add(candidate);
		            }
		        }
		        return femaleCandidates;
		    }
		}


