package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gayatri");
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rudvi");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
