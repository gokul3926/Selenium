package org.gokul;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll Down and Up using Pixels
		
		//js.executeScript("window.scrollBy(0,1000)");
		
		//Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0,-500)");
		
		//Thread.sleep(1000);
		
		//Scroll Down and Up using Xpath 
		
		//WebElement ScrolldownElement = driver.findElement(By.xpath("//a[@title='API and Services Test Automation Training in chennai']"));
		
		//js.executeScript ("arguments[0].scrollIntoView(true)",ScrolldownElement);
		
		//Thread.sleep(2000);
		
		//WebElement ScrollupElement = driver.findElement(By.xpath("//a[@title='All Courses']"));
		
		//js.executeScript("arguments[0].scrollIntoView(false)",ScrollupElement);
			
		//To pass Text
		
		WebElement Text =driver.findElement(By.xpath("//input[@name='email']"));
		
		js.executeScript("arguments[0].setAttribute('Value','Gokul')",Text);		
		
		//To pass High Lights
		
		WebElement Highlts =driver.findElement(By.xpath("//input[@name='email']"));
		
		js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px red');",Highlts);
		
		
		

	}

}
