package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHGLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      driver.findElement(By.id("firstName")).sendKeys("Gayatri");
	      driver.findElement(By.id("lastName")).sendKeys("Davuluri");
	      driver.findElement(By.id("email")). sendKeys("gayatri.siri22@gmail.com");
	      driver.findElement(By.id("confirmEmail")).sendKeys("gayatri.siri22@gmail.com");           
	      driver.findElement(By.id("password")).sendKeys("Rudvika"); 
	      driver.findElement(By.id("confirmPassword")).sendKeys("Rudvika");  
	      driver.findElement(By.id("country")).click(); 
	      driver.findElement(By.id("address1")).sendKeys("180");
	      driver.findElement(By.id("address2")).sendKeys("Hazyhills Ln");
	      driver.findElement(By.id("city")).sendKeys("Garner");
	      driver.findElement(By.id("state")).sendKeys("NorthCarolina");
	      driver.findElement(By.id("zipCode")).sendKeys("27529");
	      
     
	}

}
