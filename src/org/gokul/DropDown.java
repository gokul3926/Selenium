package org.gokul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		
		WebElement singleDropDown = driver.findElement(By.xpath("//select[@name='coffee2']"));
		
		Select select = new Select(singleDropDown);
		
		select.selectByIndex(5);
		
		select.selectByValue("coffee2");
		
		
	
	
	 
		
		
		
	}

}
