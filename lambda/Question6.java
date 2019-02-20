package com.cg.lambda;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("raja");
		list.add("renuka");
		list.add("sahithi");
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
		
	}

}
