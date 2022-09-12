package com.tnsif.Multithreading;

public class Account {
	
	public static int Balance;

	public static void main(String s[])
	{
		Service s1=new Service();
		WithDrawThread t1=new WithDrawThread(s1, 1000);
		WithDrawThread t2=new WithDrawThread(s1, 1000);
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e) {}
		
		System.out.println("Total balace is "+Balance);
	}
}
