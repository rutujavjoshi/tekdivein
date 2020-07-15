package com.core.divein;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparatorComparable {
		
	public static void main(String args[]) {
		ArrayList<Person> personList = new ArrayList<Person>();
		Person p1 = new Person(1,"Leena","Ball",34);
		Person p2 = new Person(5,"Mira","Apple",17);
		Person p3 = new Person(7,"xavior","Camel",27);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		Collections.sort(personList);
		
		System.out.println("------------Sort by Age using Comparable Interface - implemented Person ---------");
		for(Person p:personList)
		{
			System.out.println(p.toString());
		}
		
		System.out.println("------------Sort by SSN using Comparator Interface - implemented by PersonSSNComparator---------");
		
		Collections.sort(personList,new personSSNComparator());
		for(Person p:personList)
		{
			System.out.println(p.toString());
		}
	}

}//end class

class Person implements Comparable<Person>{
	
	long ssn;
	String fname;
	String lname;
	int age;
	
	
	public Person(long ssn, String fname, String lname, int age) {
		super();
		this.ssn = ssn;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		if (this.getAge()>o.getAge())
			return 1;
		else if (this.getAge()<o.getAge())
		  return -1;
		else
			return 0;
	}
}//end class

class personSSNComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		   if (o1.getSsn()>o2.getSsn())
				return 1;
			else if (o1.getSsn()<o2.getSsn())
			  return -1;
			else
				return 0;
	}
	
}
	

