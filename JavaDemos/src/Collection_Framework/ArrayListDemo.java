package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo implements List<Object>, List<Comparable> {
	//int price;

	public static void main(String[] args) {
		List<Object> al=new ArrayListDemo();
		Student s2=new Student(102,"Rashmi","ECE");
		al.add(new Integer(10));
		al.add(new Float(22.22f));
		al.add(new Student(101,"Nayana","CS"));
		al.add(new String("SKSJIT"));
		al.add(s2);
		//al.remove(s2);
		
		List<Comparable> al1=new ArrayListDemo();
		al1.add(new Character('A'));
		al1.add(new Integer(100));
		//System.out.println(price);
		al.addAll(al1);
		Iterator<Object> i1=al.iterator();
		while(i1.hasNext())
		{
			Object obj=i1.next();
			System.out.println(obj);
		}
		
	}

}
