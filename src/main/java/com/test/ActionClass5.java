package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.com/");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      Actions a=new Actions(driver);
	      WebElement list = driver.findElement(By.xpath("//span[text()[contains(.,'Account & Lists')]]"));
	      WebElement watch = driver.findElement(By.xpath("//span[text()[contains(.,'Watchlist')]]"));
	     a.moveToElement(list).moveToElement(watch).click().build().perform();
	}

}
