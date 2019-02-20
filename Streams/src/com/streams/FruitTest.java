package com.streams;


import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FruitTest {






	public static void main(String[] args) {
		List<Fruit> list=new ArrayList<>();
		list.add(new Fruit("apple",150,100,"red"));
		list.add(new Fruit("Banana",40,30,"Yellow"));
		list.add(new Fruit("mango",70,50,"yellow"));
		list.add(new Fruit("kiwi",200,80,"Green"));
		list.add(new Fruit("Guava",130,70,"Green"));
		list.add(new Fruit("grapes",40,100,"Green"));
		list.add(new Fruit("Strwaberry",20,70,"Red"));
		
		
		System.out.println("names of low calories fruits:");
		List<String> fruit_names=list.stream()
				.filter(p->p.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(Fruit::getFruit_Name)
				.collect(Collectors.toList());
		fruit_names.forEach(System.out::println);
		
		System.out.println("color wise list of fruit names:");
		List<Fruit> fruit_color=list.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		fruit_color.forEach(e->System.out.println(e.getFruit_Name()+"  color is: "+e.getColor()));
		
		System.out.println("RED color fruits:");
		List<String> fruit_price=list.stream()
				.filter(p->p.getColor()=="Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(Fruit::getFruit_Name)
				.collect(Collectors.toList());
		fruit_price.forEach(System.out::println);
		
		
}
}




