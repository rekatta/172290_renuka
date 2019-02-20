package com.cg.lambda;

import java.util.*;

public class OddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> s = new ArrayList<String>(); 
		  
	       
	        s.add("Raja"); 
	        s.add("Sahiti"); 
	        s.add("Renuka"); 
	        s.add("poojaSri"); 
	        s.add("ArchanaRaj"); 
	  
	        
	        s.removeIf(n -> (n.length()%2!=0)); 
	  
	        System.out.println("name without odd"); 
	     
	        for(String str : s)
	        {
	        	System.out.println(str);
	        }
	             
	        
	}

	

	

	

}
