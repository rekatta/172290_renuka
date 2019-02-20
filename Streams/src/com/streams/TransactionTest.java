package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			List<Transactions> list=new ArrayList<>();
			list.add(new Transactions(new Trades("manu", "Pune"),2011,2000));
			list.add(new Transactions(new Trades("mahesh","Hyderabad"),2012,3000));
			list.add(new Transactions(new Trades("kishan", "Indore"),2011,5000));
			list.add(new Transactions(new Trades("kiki", "Pune"),2015,20000));
			list.add(new Transactions(new Trades("maahi", "Indore"),2011,6000));
			list.add(new Transactions(new Trades("ankit", "Delhi"),2016,8000));
			list.add(new Transactions(new Trades("vijay", "Pune"),2017,9000));
			list.add(new Transactions(new Trades("aakash", "Delhi"),2011,10000));
			list.add(new Transactions(new Trades("akshay", "Pune"),2012,9800));
			list.add(new Transactions(new Trades("yakya", "Indore"),2014,1000));
			list.add(new Transactions(new Trades("ankeeyt", "Delhi"),2013,6000));
			list.add(new Transactions(new Trades("lokiya", "Indore"),2012,18000));
			list.add(new Transactions(new Trades("kagesh", "Delhi"),2018,80000));
			
			
			System.out.println("Q 8--------------------");
			List<Transactions> trans=list.stream()
					.filter(p->p.getYear()==2011)
					.sorted(Comparator.comparing(Transactions::getValue))
					.collect(Collectors.toList());
			trans.forEach(System.out::println);
			
			System.out.println("Q 13--------------------");
			List<Transactions> trans2=list.stream()
					.filter(p->p.getTrader().getCity()=="Delhi")
					.collect(Collectors.toList());
			trans2.forEach(e->System.out.println("Transactions value is: "+e.getValue()+" done by "+e.getTrader().getName()));
			
			System.out.println("Q 14--------------------");
			Transactions max=list.stream()
					.max((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
					.get();
			System.out.println(max.getValue());
			
			System.out.println("Q 15--------------------");
			Transactions min=list.stream()
					.min((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
					.get();
			System.out.println(min.getValue());
		}

	}


