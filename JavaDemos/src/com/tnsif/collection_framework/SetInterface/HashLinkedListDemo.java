package com.tnsif.collection_framework.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class HashLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new LinkedHashSet();
		s.add(new Float(10.4));
		s.add(new Integer(20));
		s.add(new Double(20.98899));
		s.add(new String("Nayana"));
		
		Iterator i1 = s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
