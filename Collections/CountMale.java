package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMale {
	public static int countMaleCandidate(List<String> list) {
		int maleCounter = 0;
		for (String candidate : list) {
			if (candidate.startsWith("Mr.")) {
				maleCounter++;
			}
		}
		return maleCounter;
	}

	public static int countFemaleCandidate(List<String> list) {

		int femaleCounter = 0;
		for (String candidate : list) {
			if (candidate.startsWith("Miss.")) {
				femaleCounter++;
			}
		}
		return femaleCounter;
	}

	public static ArrayList<String> getOnlyFemaleCandidate(List<String> list) {
		{
			ArrayList<String> al = new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				String candidateName = list.get(i);
				if (candidateName.startsWith("Miss.")) {
					al.add(candidateName);
				}
			}
			return al;
		}

	}

	public static void main(String[] args) {

		List<String> listOfName = Arrays.asList("Mr.A", "Mr.B", "Miss.S", "Miss.N", "Mr.V", "Miss.K");

		int maleCounter = countMaleCandidate(listOfName);
		System.out.println("male candidates are " + " " + maleCounter);

		List<String> listOfFeName = Arrays.asList("Mr.A", "Mr.B", "Miss.S", "Miss.N", "Mr.V", "Miss.K");

		int FemaleCounter = countFemaleCandidate(listOfName);
		System.out.println("Female candidates are " + " " + FemaleCounter);

	}

}