package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewsTest {

	public static void main(String[] args) {
		
			List<News> list=new ArrayList<>();
			list.add(new News(101,"xyz","The budget is an vote on acccount","Yeah True"));
			list.add(new News(102,"abc","Election notification yet to be released ","It will release by March"));
			list.add(new News(103,"def","sports","IPL "));
			list.add(new News(103,"xyz","budget","The budget is 23LAKH CRORES"));
			list.add(new News(101,"xyz","sports","First IPL mmatch is between CSK and RCB"));
			list.add(new News(101,"xyz","budget","The budget is an vote on acccount"));
			//->nPredicate<String> p= n->n.contentEquals("budget");
		List<News> list1=list.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
		long l=list1.stream().count();
		System.out.println("The word budget in comments"+l);
		System.out.println("-------------------------------------------");
		 
		 

		
		Map<Integer, List<News>> newsId1 = list.stream() .collect(Collectors.groupingBy(News::getNewsId)); 
		
        System.out.println(newsId1);
        System.out.println();
		Integer count =newsId1.values().stream().mapToInt(List::size).sum();
		System.out.println(count);
	
		//Map<String,long> map=list.stream().collect(groupingBy(s->s,Collectors.counting()));

}
}