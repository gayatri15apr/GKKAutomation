package com.smallandmore;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
 @Test(alwaysRun=true)
 public void facebook()
 {
	 System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl()); 
 }
}
