package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.com/");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     Actions a=new Actions(driver);
	    // Thread.sleep(4000);
	     WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	   // a.moveToElement(textbox).sendKeys("iphone", Keys.ENTER).build().perform();
	  // a.sendKeys(textbox,"iphone", Keys.ENTER).build().perform();
	     textbox.sendKeys("iphone",Keys.ENTER);
	     
	}

}
