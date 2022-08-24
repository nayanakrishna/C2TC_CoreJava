package com.tnsif.lesson1;

abstract class Demo {
	private Integer firstNumber = 100;
	Float secondNumber = 200.0f;
	Integer SPEEDLIMIT = 80;
	/* method to calculate product of two number */
	abstract void calculateProduct();
	
}
class DemoOne extends Demo
{
	void calculateProduct()
	{
		System.out.println("Product is ");
	}
}
public class One {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj = new One();	
		//obj.calculateProduct();	
	}

}
// A) Simple B) Encapsulation C) Abstraction D) Inheritance
// public private protected default