package com.tnsif.lesson2b;
//program to demostrate static class
class Outer
{
	static Integer firstNumber = 100;
	static class Inner
	{
		void displayNumber()
		{
			System.out.println("Number is "+firstNumber);
		}
	}
}
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner obj = new Outer.Inner();
		obj.displayNumber();
	}

}
