package com.ng;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	@Test(dependsOnMethods= {"cherry"})
	public void mango()
	{
		System.out.println("Mango");
	}
	@Test(dependsOnMethods= {"grapes"})
	public void banana()
	{
		System.out.println("Banana");
	}
	@Test(dependsOnMethods= {"mango"})
	public void apple()
	{
		System.out.println("Apple");
	}
	@Test()
	public void cherry()
	{
		System.out.println("Cherry");
	}
	@Test(dependsOnMethods= {"apple"})
	public void grapes()
	{
		System.out.println("Grapes");
	}
}
