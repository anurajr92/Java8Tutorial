package com.java8.stram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramCheck {
	
	
	public static void main(String args[])
	{
		List<Person> personList = Arrays.asList(new Person("Anuraj",26),
				new Person("Syam",29),
				new Person("Sreejith",28));
		
		/** to find the first element using stram **/
//		findfirts(personList); 
		
		
		/** Using stram filter and  foreach **/
//		useForeach(personList);
		
		/** Using stram mapo and collect to list **/
//		useCollectAndMap(personList);
		
		/** Using stram allmatch, any match**/
//		findMatchMethod(personList);
		
		
		/** Using collect and Map, Map is to convert one form of object to another, Upper to lower, String to int etc**/
//		UseCollect();
		
		/** Using collect and Map, Map is to convert one form of object to another, Upper to lower, String to int etc**/
		sortCollection(personList);
	}
	
	private static void sortCollection(List<Person> personList) {
		
		// Normal comparison
		List<Person> newList = personList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		newList.forEach(p -> System.out.println(p.getName()));
		
		
		// reverse comparison
		List<Person> revList = personList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		revList.forEach(p -> System.out.println(p.getName()));
				
				
		// age comparison
		List<Person> newAgeList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		newAgeList.forEach(p -> System.out.println(p.getName()));
				
	}

	private static void UseCollect() {
		List<String> newList = Arrays.asList("a", "b", "c", "d");
		newList.stream().map(p->p.toUpperCase()).collect(Collectors.toList()).forEach(s -> System.out.println(s)); //New Converted LIst
		
	}

	private static void findMatchMethod(List<Person> personList) {
		boolean i = personList.stream().allMatch(p ->p.getName().length()>=4);
		System.out.println(i);
		
	}

	private static void useCollectAndMap(List<Person> personList) {
		personList.stream().map(p -> p.getName()).collect(Collectors.toList()).forEach(p -> System.out.println());
		
	}

	private static void useForeach(List<Person> personList) {
		personList.forEach(p -> System.out.println(p.getName()));
		personList.stream().filter(p -> p.getAge()>26).forEach(p -> System.out.println(p.getName()+" "+p.getAge()));
		personList.stream().filter(p -> p.getName().length()>5).forEach(p -> System.out.println(p.getName()+" "+p.getAge()));
		
	}

	private static void findfirts(List<Person> personList)
	{
		Optional<Person> opt = personList.stream().findFirst();
		System.out.println(opt.get().getName());
	}
	
	

}
