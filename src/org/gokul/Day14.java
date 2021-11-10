package org.gokul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day14 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		
		WebElement multiSelect = driver.findElement(By.xpath("//select[@name='coffee2']"));
		
		
		Select s = new Select (multiSelect);
		
		s.deselectAll();
		
		List <WebElement>Text = s.getOptions();
		
		
		
																																																																																																																																																																																																																								
		
		
		
			

	}

}
