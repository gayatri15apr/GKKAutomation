package com.smallandmore;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Walmart {
 @Test(enabled=false)
 public void walmart()
 {
	 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.walmart.com/");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
 }
}
