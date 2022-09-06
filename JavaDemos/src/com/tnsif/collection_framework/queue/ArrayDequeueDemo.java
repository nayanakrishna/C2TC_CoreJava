package com.tnsif.collection_framework.queue;
import java.util.*;
public class ArrayDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(40);
		dq.offerLast(50);
		
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);
		
		dq.forEach((x)->System.out.println(x));
		
		System.out.println("-------------------- ");
		System.out.println("After deleting ");
		System.out.println("-------------------- ");
	
		dq.pollFirst();
		dq.pollLast();
		dq.forEach((y)->System.out.println(y));

	}

}
