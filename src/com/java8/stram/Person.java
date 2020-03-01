package com.java8.stram;


public class Person implements Comparable<Person>{
	
	private String name;
	private  int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person obj) {
		
		return name.compareTo(obj.getName());
	}
	
	
	

}
