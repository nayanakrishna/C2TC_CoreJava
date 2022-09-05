package com.tnsif.collection_framework.mapping;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<String, String>();
		m.put("SID", "102");
		m.put("SName", "Nayana");
		m.put(null, null);
		
		
		System.out.println("Iterate over HashMap Keys and Values");
		for(Map.Entry<String, String> entry :  m.entrySet()){
		    System.out.println( entry.getKey() + " : " + entry.getValue() );
		}

	
				
		
		
	}

}
