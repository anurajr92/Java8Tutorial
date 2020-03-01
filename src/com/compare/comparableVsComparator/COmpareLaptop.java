package com.compare.comparableVsComparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COmpareLaptop {
	
	public static void main(String args[])
	{
		List<Laptop> laptopLIst = Arrays.asList(
				new Laptop("HP", 12000, 2),
				new Laptop("Lenovo", 17000, 4),
				new Laptop("Apple", 18000, 4),
				new Laptop("ACer", 10000, 8));
		
		
		Collections.sort(laptopLIst);
		
		
		for(Laptop lap:laptopLIst)
		{
			System.out.println(lap.getName() +" "+lap.getPrice()+" "+lap.getRam());
		}
		
		System.out.println("----------new List----------");
		Collections.sort(laptopLIst, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getRam() > o2.getRam())
					return -1;
				else if(o1.getRam() == o2.getRam())
					if(o1.getPrice()> o2.getPrice())
						return 1;
					 else
						 return -1;
				else
					return 1;
			}
			
		});
		
		for(Laptop lap:laptopLIst)
		{
			System.out.println(lap.getName() +" "+lap.getPrice()+" "+lap.getRam());
		}
		
	}
	
	

}
