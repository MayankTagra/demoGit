package SupportAndServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import HomePage.BaseTest;

public class Ideas extends BaseTest{
	@Test()
	public void SortDropdown() throws InterruptedException
	{		
		test=extent.createTest("Sort Dropdown");
		WebDriver driver=Login();
		driver.get("https://success.salesforce.com/ideaSearch?filter=Delivered+in+Winter+17");
		Thread.sleep(2000);
		//Click Sort
		
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		driver.findElement(By.linkText("Popular")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Recent")).click();
		Thread.sleep(5500);
		driver.findElement(By.xpath("//button[@id='idea_filter_opener']")).click();
		
		driver.findElement(By.linkText("Trending")).click();
		Thread.sleep(2300);
		driver.close();
		
	}
	@Test()
	public void StatusFilterDropdown() throws InterruptedException
	{	
		test=extent.createTest("Status Filter Dropdown");
		WebDriver driver=Login();
				driver.get("https://success.salesforce.com/ideaSearch");
		Thread.sleep(4500);
		//driver.findElement(By.xpath("//button[@id='idea_status_filter_opener']")).click();
		
		int count=driver.findElement(By.xpath("//div[@class='overlay-menu overlay-menu-select'][2]//ul"))
				.findElements(By.tagName("li")).size();
		System.out.println(count);
		System.out.println();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions builder=new Actions(driver);
		
		for(int i=2;i<=count;i++)
		{
/*			driver.findElement(By.xpath("//button[@id='idea_status_filter_opener']")).click();
*/
			
			builder.moveToElement(driver.findElement(By.xpath("//button[@id='idea_status_filter_opener']")))
			.click().build().perform();
			
			Thread.sleep(3400);
			builder.moveToElement(driver.findElement(By.xpath("//div[@class='overlay-menu overlay-menu-select'][2]//ul//li["+i+"]")))
			.click().build().perform();
			System.out.println(i);
			Thread.sleep(5600);
		//	js.executeScript("window.scrollBy(0,50)");
			
			//wait time if needed
			
		}

		Thread.sleep(6700);
		driver.close();
	}
	@Test()
	public void SelectAllOptionsOnLeft() throws InterruptedException
	{	
		test=extent.createTest("Select All Options On Left");
		WebDriver driver=Login();
driver.get("https://success.salesforce.com/ideaSearch");
		
		int count=driver.findElement(By.xpath("//ul[@class='ul-reset ul-nav2']")).findElements(By.tagName("li")).size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:"+i+"']")).click();
			Thread.sleep(4500);
			
			for(int k=0;k<34;k++)
			{
				try
				{		
					if(i==0)
					{
					driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:0:f121:"+k+"']")).click();
					Thread.sleep(3400);
					}
					if(i==1)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:1:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
					if(i==2)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:2:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
					if(i==3)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:3:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==4)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:4:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==5)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:5:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
					if(i==6)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:6:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
					if(i==7)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:7:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==8)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:8:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
					if(i==9)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:9:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==10)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:10:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==11)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:11:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==12)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:12:f121:"+k+"']"))
						.click();
						Thread.sleep(2300);
					}
					if(i==13)
					{
						driver.findElement(By.xpath("//a[@id='leftNavsearch:BaseLayout:searchForm:f1:0:f12:13:f121:"+k+"']"))
						.click();
						Thread.sleep(3400);
					}
				}
				catch(Exception e)
				{
					
				}
			}
		}
		
	}
}
