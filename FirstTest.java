package com.google.tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Ruthra Ved");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='rso']/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(5000);
		
		driver.close();
  }
  

}
