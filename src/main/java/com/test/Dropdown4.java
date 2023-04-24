package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Register.html");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Gayatri");
         driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Davuluri");  
         driver.findElement(By.xpath("//div[@class='form-group']/following::textarea")).sendKeys("180,Hazyhills Ln,Garner");
         driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gayatri.siri22@gmail.com");
         driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("666666666");
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
        language.click();
       // /following::li/a"
       // s.selectByVisibleText("Bulgarian");
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select s1=new Select(skills);
        s1.selectByVisibleText("iPhone");
         driver.findElement(By.xpath("//select[@id='countries']")).click();
         WebElement country = driver.findElement(By.xpath("//select[@id='country']/following::li"));
         Select s2=new Select(country);
         s2.selectByVisibleText("India"); 
         WebElement yearbox = driver.findElement(By.xpath("//select[@id='yearbox']"));
	     Select s3=new Select(yearbox);
	     s3.selectByVisibleText("1919");
	    WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	     Select s4=new Select(Month);
	       
	     s4.selectByVisibleText("March");
	    WebElement daybox = driver.findElement(By.xpath("//select[@id='daybox']"));
	    Select s5=new Select(daybox);
	     s5.selectByVisibleText("3");
	    driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Rudvi");
         driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Rudvi");
         driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
         driver.findElement(By.xpath("//input[@id='Button1']")).click();
        
        
        
        
        
        
	}

}
