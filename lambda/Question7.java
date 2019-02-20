package com.cg.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("raja","khammam");
		map.put("sahithi","kakinada");
		map.put("renuka","vizag");
		map.put("pooja","bebgaluru");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
	}

}
