package org.gokul;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement X = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		X.click();

		WebElement Search = driver.findElement(By.name("q"));

		Search.sendKeys("i phone");

		WebElement Search1 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));

		Search1.click();

		Thread.sleep(3000);
		List<WebElement> listofphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		for (int i = 0; i < listofphones.size(); i++) {
			WebElement Element = listofphones.get(i);
			String xx = Element.getText();
			System.out.println(xx);
		}

		List<WebElement> listofphones2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		for (int j = 0; j < listofphones2.size(); j++) {
			WebElement Elements1 = listofphones2.get(j);
			String xxx = Elements1.getText();
			System.out.println(xxx);

		}

		listofphones2.addAll(listofphones);
	}

	Map<String, Integer> mi = new TreeMap();
	Set<Entry<String, Integer>> x = mi.entrySet();
	
	
}


