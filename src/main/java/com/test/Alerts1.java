package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demoqa.com/alerts");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	   Alert at = driver.switchTo().alert();
	    at.accept(); 
	   driver.findElement(By.xpath("//button[text()[contains(.,'Click me')]]")).click();
	     
	  at.accept();
	    
	     driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	   //  Alert at = driver.switchTo().alert();
	   at.accept();
	     
	     driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	     at.sendKeys("Gayatri");
	     at.accept();
	     
	}

}
