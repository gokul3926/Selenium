package org.gokul;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		SimpleAlert.click();

		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);

		WebElement DoubleAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		DoubleAlert.click();

		WebElement DoubleAlert1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		DoubleAlert1.click();
		Thread.sleep(2000);

		Alert b = driver.switchTo().alert();
		b.accept();

		WebElement PromptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));

		PromptAlert.click();

		WebElement PromptAlert1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Thread.sleep(2000);

		PromptAlert1.click();

		Alert c = driver.switchTo().alert();

		String text = c.getText();
		System.out.println(text);

		c.sendKeys("ok");

		c.accept();

	}

}
