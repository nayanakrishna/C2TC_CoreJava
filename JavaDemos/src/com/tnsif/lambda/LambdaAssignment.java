package com.tnsif.lambda;

import java.util.function.Predicate;

public class LambdaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> o = num -> num %2==0;
		int A[]= {2,3,5,6,7};
		int even=0;
		int odd=0;
		for(Integer i: A) {
			if(o.test(i)) even++;
			else odd++;
		}
		
		System.out.println(even);
		System.out.println(odd);
			

	}

}
