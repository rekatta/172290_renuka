package com.streams;

public class Transactions {
	
	int year; 
	int value;
	Trades trader;
	
	public Transactions(Trades trader,  int year,int value) {
		super();
		this.year = year;
		this.value = value;
		this.trader = trader;
	}
	public Trades getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Transactions [year=" + year + ", value=" + value + ", trader=" + trader + "]";
	}
	
}
