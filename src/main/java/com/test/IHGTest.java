package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gayatri");
	     driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Davuluri");
	     driver.findElement(By.xpath("//input[@type='email']")). sendKeys("gayatri.siri22@gmail.com");
	     driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("gayatri.siri22@gmail.com");           
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rudvika"); 
	     driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Rudvika");  
	     driver.findElement(By.xpath("//select[@id='country']")).click(); 
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("180");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hazyhills Ln");
	     driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Garner");
	     driver.findElement(By.xpath("//input[@id='state']")).sendKeys("NorthCarolina");
	     driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("27529");
	}

}
