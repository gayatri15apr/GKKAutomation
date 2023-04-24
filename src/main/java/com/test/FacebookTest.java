package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver Driver=new ChromeDriver();
	      Driver.get("https://www.facebook.com/");
	      Driver.manage().window().maximize();
	      System.out.println(Driver.getTitle());
	      System.out.println(Driver.getCurrentUrl());
	      Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gayatri");
	      Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rudvi");
	      Driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
