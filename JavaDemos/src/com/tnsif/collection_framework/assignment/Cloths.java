package com.tnsif.collection_framework.assignment;


import java.util.*;

public class Cloths implements ShoppingIteams {

	@Override
	public void iteam() {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m = new HashMap<String, Integer>(); 
	      m.put("Puma",2003);    
	      m.put("Gucchi",4000);    
	      m.put("H&M",50000);    
	      m.put("Zara",20000);    
	      
		// TODO Auto-generated method stub
		System.out.println("Cloth brands along with its price");
		for(Map.Entry<String, Integer> entry :  m.entrySet()){
		    System.out.println( entry.getKey() + " : " + entry.getValue() ); 
		
	}


	}
}
