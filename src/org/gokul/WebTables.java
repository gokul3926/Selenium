package org.gokul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		//driver.manage().window().maximize();
		
		//to locate table
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		//to locate heading
		
		WebElement heading = table.findElement(By.tagName("thead"));
		
		//to locate row
		
		WebElement headingRow = heading.findElement(By.tagName("tr"));
		
		//to locate Row Headings
	
		List<WebElement> rowHeading = headingRow.findElements(By.tagName("th"));
		
		int size = rowHeading.size();
		
		for (int i = 0; i < rowHeading.size(); i++) {
			WebElement Element = rowHeading.get(i);
			String text = Element.getText();
			System.out.print(text+"\t");
			
		}
		
		System.out.println();
			
		
		//to locate content
			
			WebElement content = table.findElement(By.tagName("tbody"));
			
		//to locate contentRow
			
			List<WebElement> contentRow = content.findElements(By.tagName("tr"));
					
			for (int j = 0; j <contentRow.size(); j++) {
				
				WebElement data = contentRow.get(j);
				
				List<WebElement> contentD = data.findElements(By.tagName("td"));
				
				for (int i = 0; i < contentD.size(); i++) {
					
					WebElement data1 = contentD.get(i);
					
					String text1 = data1.getText();
					
					System.out.print(text1+"\t");
			
				}
				
				System.out.println();
				
			}	

			
		}	
	
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

