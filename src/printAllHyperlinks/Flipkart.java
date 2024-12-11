package printAllHyperlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//a"));
		for(WebElement ele: hyperlinks)
		{
			System.out.println(ele.getText());
		}
	}
}