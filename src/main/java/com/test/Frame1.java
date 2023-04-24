package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	  //  WebElement findElement = driver.findElement(By.xpath("//iframe[@id='frame3']"))
	     driver.switchTo().frame("frame1");
	     driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Animals");
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("frame1").switchTo().frame("frame3");
	     driver.findElement(By.xpath("//input[@id='a']")).click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("frame2");
	     WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
	     Select s=new Select(animals);
	     s.selectByValue("avatar");
	     
	     
	     
	}

}
