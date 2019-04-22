package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseTest;

public class Answers extends BaseTest{
	@Test()
	public void SelectAllTopics() throws InterruptedException
	{	test=extent.createTest("Select All Topics");
		WebDriver driver=Login();

		driver.get("https://help.salesforce.com/search?sfContext#q=live%20agent&f:@sflanguage=%5Ben_US%5D&firstQueryMeta=%5Bobject%20Object%5D");
		Thread.sleep(4500);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(4500);
		driver.findElement(By.linkText("Answers")).click();
		Thread.sleep(4500);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(4500);
		
		driver.findElement(By.linkText("Events")).click();
		Thread.sleep(4500);
		driver.findElement(By.linkText("Collaboration")).click();
		Thread.sleep(4500);
		driver.navigate().back();
		driver.findElement(By.linkText("Ideas")).click();
		Thread.sleep(4500);
		driver.findElement(By.linkText("Featured Groups")).click();
		Thread.sleep(4500);
		driver.findElement(By.linkText("Known Issues")).click();
		Thread.sleep(4500);
		
		
		driver.close();
			
	}
	
	@Test()
	public void ShowsolvedDropdown() throws InterruptedException
	{	
		test=extent.createTest("Show Solved dropdown");
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/answers?feedtype=RECENT&criteria=BESTANSWERS");
		Thread.sleep(3400);

		driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
		Thread.sleep(3000);
		int count=driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
				.findElements(By.tagName("li")).size();
		System.out.println(count);

		for(int i=0;i<count;i++)
		{		
			if(i==0)
			{
				driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
					.findElements(By.tagName("li")).get(0).click();

			}
			else
			{

				driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']"))
				.click();
				Thread.sleep(3400);
	
	
				driver.findElement(By.xpath("//div[@class='zen-options ']//ul[@class='feedfilters']"))
				.findElements(By.tagName("li")).get(i).click();
				System.out.println(i);
	
				Thread.sleep(3400);
			}

		}
		
		int sortCount=driver.findElement(By.xpath("//ul[@class='feedsortby']"))
				.findElements(By.tagName("li")).size();
		System.out.println(sortCount);
		
				
		driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
		for(int i=0;i<sortCount;i++)
		{
			if(i==0)
			{
			   driver.findElement(By.xpath("//ul[@class='feedsortby']"))
			   	.findElements(By.tagName("li")).get(0).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[@id='feedFilterDropDownElement']")).click();
				Thread.sleep(3400);
				driver.findElement(By.xpath("//ul[@class='feedsortby']"))
				.findElements(By.tagName("li")).get(i).click();
				Thread.sleep(3400);
				
				
			}
		}
		System.out.println("Finally All Clicked");
		driver.close();

	}
	

}
