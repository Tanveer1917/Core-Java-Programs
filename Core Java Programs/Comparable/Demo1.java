package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ComboBoxEditor;

class Student implements Comparable<Student>
{
int stud_id;
String name;
String skill;
int age;
public Student(int stud_id, String name, String skill, int age) {
	super();
	this.stud_id = stud_id;
	this.name = name;
	this.skill = skill;
	this.age = age;
	
}
public int getStud_id() {
	return stud_id;
}
public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [stud_id=" + stud_id + ", name=" + name + ", skill=" + skill + ", age=" + age + "]";
}


@Override
public int compareTo(Student o) {
	
	if(this.getAge()> o.getAge())
		return 1;
	else
	return 0;
}


}

class agesorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge()>o2.getAge())
		{
			return 1;
			
			
		}
		else
		return -1;
	}
	}

class idsorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.stud_id>s2.stud_id)
		{
			return 1;
		}
	else
	{
		return -1;
	}
	
}
	
}	
		
	
public class Demo1 {

	public static void main(String[] args) {
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1,"A", "Java", 21));
		list1.add(new Student(2,"FG", "C#", 25));
		list1.add(new Student(20,"AG", "C++", 24));
		list1.add(new Student(14,"RT", "c", 71));
		
		
	System.out.println("sorting by name");
		Comparator<Student> cmp = new agesorting();
		//Collections.sort(list1,cmp);
//		for (Student student : list1) {
//			System.out.println(student.getName()+" "+student.getAge());
//		}
		list1.sort(cmp);
		System.out.println(list1);
		
		System.out.println("Sorting by id");
		
		Comparator<Student> cmp1 = new idsorting();
//		Collections.sort(list1,cmp1);
//		for (Student student : list1) {
//			System.out.println(student.getStud_id()+" "+student.getName());
//		}
		
		list1.sort(cmp1);
		System.out.println(list1);
	}
	

}