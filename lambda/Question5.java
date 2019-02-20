package com.cg.lambda;

import java.util.ArrayList;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("raja");
		array.add("pooja");
		array.add("renu");
		array.add("sahithi");
		System.out.println("String is :\n"+array);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = array.stream().map(n-> Character.toString(n.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(stringresult);

	}

}
