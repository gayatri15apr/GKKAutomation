package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

	}

}
