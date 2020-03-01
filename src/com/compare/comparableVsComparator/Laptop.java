package com.compare.comparableVsComparator;

public class Laptop implements Comparable<Laptop>{
	
	private String name;
	private int price;
	private int ram;
	
	public Laptop(String name, int price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}


	@Override
	public int compareTo(Laptop obj) {
		if(this.getPrice() > obj.getPrice())
			return 1;
		else
			return -1;	
	}
	
	
	
	

}
