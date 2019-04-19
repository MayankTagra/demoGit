package SupportAndServices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomePage.BaseTest;

public class InputSupport extends BaseTest {


	@Test()
	public void NavigateTopResults() throws InterruptedException
	{	test=extent.createTest("Navigate Top Results");
		
	String parentid=null;
	String childid=null;
	WebDriver driver=Login();
		driver.get("https://www.salesforce.com/in/cro/index-smb/?ir=1");
			
			Thread.sleep(3400);
			driver.findElement(By.linkText("Support & Services")).click();
			Thread.sleep(3400);
			Actions builder=new Actions(driver);
			builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input")))
			.sendKeys("Live").build().perform();
			Thread.sleep(3400);
			builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			
		//xpath   //div[@class='coveo-results-column']//div[@class='CoveoResultList']//a
			
			WebDriverWait wait=new WebDriverWait(driver,230);
			Thread.sleep(5300);
			//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")));
		int count=driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']"))
				.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		for(int i=0;i<count-1;i++)
		{		
			System.out.println(i);
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")));
			driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']"))
			.findElements(By.tagName("a")).get(i).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='box']//div[@id='content']")));
			Thread.sleep(5500);
			driver.navigate().back();
			Thread.sleep(5500);
		}
		//Count the no.of Pages and navigate in between them
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		int pcount=driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li")).size();
		System.out.println(pcount);
		for(int i=0;i<pcount;i++)
		{
			try
			{
				driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li"))
				.get(i).click();
				Thread.sleep(5600);
				
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
			}
		}
		
		Thread.sleep(3400);
		driver.close();
			
		
			

	}
	
	

}
