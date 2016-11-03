package com.adolatowska.jbehave.tutorial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyPage {
private static WebDriver driver;
	
	public MyPage() {
		driver = new FirefoxDriver();
	}
	
	public void openMyPage(){
		driver.get("http://google.pl");
	}
	
	public void typeQuery(String query){
		driver.findElement(By.id("lst-ib")).sendKeys(query);
	}
	
	public String getQuery(){
		return driver.findElement(By.id("lst-ib")).getText();
	}
	
	public void closeMyPage(){
		driver.close();
		driver.quit();
	}
}
