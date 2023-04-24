package com.grp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Walmart {
 @Test(groups= {"smoke"})
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
