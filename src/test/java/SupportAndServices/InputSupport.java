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
	//	driver.get("https://www.salesforce.com/in/cro/index-smb/?ir=1");
		WebDriverWait wait=new WebDriverWait(driver,230);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Support & Services")).click();
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='magic-box-input']//input"))).sendKeys("Live")
		.build().perform();
		
		Thread.sleep(2300);
		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3400);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")));
		int count=driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']"))
				.findElements(By.tagName("a")).size();
		System.out.println(count);
	
		for(int i=0;i<count-1;i++)
		{		
			System.out.println(i);
			System.out.println();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']")));
			driver.findElement(By.xpath("//div[@class='coveo-results-column']//div[@class='CoveoResultList']"))
			.findElements(By.tagName("a")).get(i).click();
			
			Set<String> win=driver.getWindowHandles();
			Iterator<String> itr=win.iterator();
			while(itr.hasNext())
			{
				parentid=itr.next();
				childid=itr.next();
			}
			driver.switchTo().window(childid);
			Thread.sleep(3400);
			driver.close();
			driver.switchTo().window(parentid);
			
		}
			System.out.println("All Links Clicked");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
			
			int pcount=driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li")).size();
			System.out.println(count);
			
			for(int i=0;i<pcount;i++)
			{	System.out.println("Pcount"+pcount);
				driver.findElement(By.xpath("//ul[@class='coveo-pager-list']")).findElements(By.tagName("li")).get(i).click();
				Thread.sleep(4500);
			}
			Thread.sleep(3400);
			driver.close();
			

			

	}
	
	

}
