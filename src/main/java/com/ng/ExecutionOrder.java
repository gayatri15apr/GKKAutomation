package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOrder {
    @Test
	public void one()
	{
		System.out.println("One");
	}
	@AfterMethod
	public void two()
	{
		System.out.println("Two");
	}
	@BeforeMethod
	public void three()
	{
		System.out.println("Three");
	}
	@AfterClass
	public void four()
	{
		System.out.println("Four");
	}
	@BeforeClass
	public void Five()
	{
		System.out.println("five");
	}
	@AfterTest
	public void six()
	{
		System.out.println("Six");
	}
	@BeforeTest
	public void seven()
	{
		System.out.println("Seven");
	}
	@AfterSuite
	public void eight()
	{
		System.out.println("Eight");
	}
	@BeforeSuite
	public void nine()
	{
		System.out.println("Nine");
	}
	
}
