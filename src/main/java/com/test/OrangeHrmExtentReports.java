package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmExtentReports()  
{
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

}
