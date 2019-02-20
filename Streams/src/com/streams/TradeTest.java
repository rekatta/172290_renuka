package com.streams;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TradeTest {

	public static void main(String[] args) {
		List<Trades> list=new ArrayList<>();
		list.add(new Trades("raja", "Khammam"));
		list.add(new Trades("raja1","Pune"));
		list.add(new Trades("renuka", "Vizag"));
		list.add(new Trades("renu", "Pune"));
		list.add(new Trades("sahiti", "kakinada"));
		list.add(new Trades("sahithi", "Indore"));
		list.add(new Trades("pooja", "Pune"));
		list.add(new Trades("ramesh", "Indore"));
		list.add(new Trades("shreyas", "Indore"));
		list.add(new Trades("kavya", "Hyderabad"));
		
		
		System.out.println("Q 9 --------------------");
		
		List<String> names1=list.stream()
				.map(Trades::getCity)
				.distinct()
				.collect(Collectors.toList());
		names1.forEach(System.out::println);
		
		
		System.out.println("Q 10 --------------------");
		List<Trades> names=list.stream()
				.filter(p->p.getCity()=="Pune")
				.sorted(Comparator.comparing(Trades::getName))
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("Q 11 --------------------");
		
		List<Trades> names4=list.stream()
				.sorted(Comparator.comparing(Trades::getName))
				.collect(Collectors.toList());
		String S=names4.stream()
				.map(Trades::getName)
				.collect(Collectors.joining(", "));
		System.out.println(S);
		
		
		System.out.println("Assignment 12 --------------------");
	
		List<String> names2=list.stream()
				.filter(p->p.getCity()=="Indore")
				.map(Trades::getName)
				.collect(Collectors.toList());
		names2.forEach(System.out::println);
		
		
		
		
	}

}
