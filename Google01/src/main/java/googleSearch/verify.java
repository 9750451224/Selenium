package googleSearch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verify {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		try
		{
			driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			WebElement radioButton = driver.findElement(By.id("my-radio-2"));
			Boolean isSelected = radioButton.isSelected();
			System.out.println(isSelected);
			
			WebElement dropdown = driver.findElement(By.name("my-select"));
			Select s = new Select(dropdown);
		//	s.selectByVisibleText("One");
		
			List<WebElement> optionList = s.getOptions();
			for(WebElement options : optionList)
			System.out.println(options.getText());
		}
		finally
		{
			//driver.quit();
		}
		
	}

}
