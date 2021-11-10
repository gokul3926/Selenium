package org.gokul;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement gmail = driver.findElement(By.xpath("//a[@target='gb_f']"));
		
		Actions action = new Actions (driver);
		action.contextClick(gmail).perform();
		
		driver.close();
		
		

		
		
		
		
		
		

	}

}
