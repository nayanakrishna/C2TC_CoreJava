package com.tnsif.collection_framework.queue;
import java.util.*;

class Mycomparotor implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1<o2) return 1;
		if(o1>o1) return -1;
		return 0;
	}
}
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p = new PriorityQueue<>(new Mycomparotor());
		p.add(20);
		p.add(10);
		p.add(30);
		p.add(5);
		p.add(15);
		p.add(3);
		
		System.out.println(p.peek());
		p.forEach((x)->System.out.println(x));
		
		System.out.println("-------------");
		System.out.println("After Deletion");
		System.out.println("--------------");
		
		p.poll();
		System.out.println(p.peek());
		p.forEach((x)->System.out.println(x));

	}

}
