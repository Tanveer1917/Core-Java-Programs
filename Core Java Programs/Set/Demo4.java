package com.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Trainer {
	private int trainerId;
	private String trainerName;
	private List<String> skills;
	private Set<Long> phones;
	private double salary;

	public Trainer(int trainerId, String trainerName, List<String> skills, Set<Long> phones, double salary) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.skills = skills;
		this.phones = phones;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", skills=" + skills + ", phones="
				+ phones + ", salary=" + salary + "]";
	}

}

public class Demo4 {

	public static void main(String[] args) {

		Set<Trainer>setOfTrainer=new LinkedHashSet();
		List<String>listOfSkills=new ArrayList();
		listOfSkills.add("java");
		listOfSkills.add("C");
		
		Set<Long>setOfPhones=new HashSet();
		setOfPhones.add(1223456L);
		setOfPhones.add(4567774L);
		
		
		Trainer t1=new Trainer(108,"A",listOfSkills,setOfPhones,56000.00);
		
		//second rainer object
		
		List<String>listOfSkills1=new ArrayList();
		listOfSkills1.add("PHP");
		listOfSkills1.add("DS");
		
		Set<Long>setOfContacts=new HashSet();
		setOfContacts.add(5685225L);
		setOfContacts.add(8631457L);
		
		Trainer t2=new Trainer(109,"B",listOfSkills,setOfPhones,46000.00);
		
		setOfTrainer.add(t1);
		setOfTrainer.add(t2);
		
		for(Trainer t:setOfTrainer)
		{
			System.out.println(t);
		}
		
		
		
		
	}

}
