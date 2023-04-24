package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Register.html");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     WebElement yearbox = driver.findElement(By.xpath("//select[@id='yearbox']"));
	     Select s=new Select(yearbox);
	     s.selectByVisibleText("1919");
	    WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	     Select s1=new Select(Month);
	       
	     s1.selectByVisibleText("March");
	    WebElement daybox = driver.findElement(By.xpath("//select[@id='daybox']"));
	    Select s2=new Select(daybox);
	     s2.selectByVisibleText("3");
	    
	     
	     		
	}

}
