package com.streams;

public class Trades {
	String name;
	String city;
	
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Trades(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trades [name=" + name + ", city=" + city + "]";
	}

}
