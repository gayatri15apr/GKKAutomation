package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      Actions a=new Actions(driver);
	      WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	     a.sendKeys(username, "gayatri").build().perform();
	     a.
	      
	}

}
