package hiddernDropwdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(1000);
		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		System.out.println(items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText());
			Thread.sleep(1000);
		}
		
		}
		finally
		{
			
		}
		
		
	}

}
