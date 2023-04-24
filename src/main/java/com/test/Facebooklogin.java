package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
      ChromeDriver Driver=new ChromeDriver();
      Driver.get("https://www.facebook.com/");
      Driver.manage().window().maximize();
      System.out.println(Driver.getTitle());
      System.out.println(Driver.getCurrentUrl());
      Driver.findElement(By.partialLinkText("Forgot")).click();
      	}

}
