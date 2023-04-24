package com.ng;

import org.testng.annotations.Test;

public class FruitsTest {
	@Test(priority=2)
	public void mango()
	{
		System.out.println("Mango");
	}
	@Test(priority=5)
	public void banana()
	{
		System.out.println("Banana");
	}
	@Test(priority=3)
	public void apple()
	{
		System.out.println("Apple");
	}
	@Test(priority=1)
	public void cherry()
	{
		System.out.println("Cherry");
	}
	@Test(priority=4)
	public void grapes()
	{
		System.out.println("Grapes");
	}
	
	

}
