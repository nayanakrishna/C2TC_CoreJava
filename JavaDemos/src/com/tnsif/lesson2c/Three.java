package com.tnsif.lesson2c;
//program to demostrate static method

class DemoOne {
	 static Integer firstNumber = 100;
	 static int displayNumber() {
		return firstNumber;
	}
}
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Object creation is required if variable is not static
		DemoOne obj = new DemoOne();
		System.out.println(obj.displayNumber());
		*/
		
		/* Object creation not required if variable is static
		 * */
		System.out.println("Number is "+DemoOne.displayNumber());
	}

}
