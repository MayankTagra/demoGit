package HomePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
	
public class Header extends BaseTest  {
@Test()
public void NavBarHover() throws InterruptedException
{	
	test=extent.createTest("Nav Bar Hover");
	WebDriver driver=Login();
	driver.get(url());
	driver.manage().window().maximize();
	
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.linkText("PRODUCTS")));
	builder.moveToElement(driver.findElement(By.linkText("SOLUTIONS")));
	builder.moveToElement(driver.findElement(By.linkText("Support & Services")));
	builder.moveToElement(driver.findElement(By.linkText("Events")));
	builder.moveToElement(driver.findElement(By.linkText("Customer Success")));
	builder.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
	
	driver.findElement(By.linkText("PRODUCTS")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("SOLUTIONS")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Support & Services")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Events")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Customer Success")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("About Us")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	
	driver.close();
	

	
	
}
@Test()
public void InputSearch() throws InterruptedException
{	
	test=extent.createTest("nput search");
	WebDriver driver=Login();
	driver.get(url());
	Actions builder=new Actions(driver);
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")).sendKeys("live");
	Thread.sleep(10000);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")))
	.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(4500);
	//driver.close();
	
	
	
}
@Test()
public void InputTypeAndErase() throws InterruptedException
{	
	test=extent.createTest("Input type and erase");
	WebDriver driver=Login();
	driver.get(url());
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-input']//input")).sendKeys("live");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='magic-box-icon']")).click();
	driver.close();
	
	
}
@Test()
public void Globe() throws InterruptedException
{	
	test=extent.createTest("Globe");
	WebDriver driver=Login();
	//driver.get(url());
driver.get("https://www.salesforce.com/in/cro/index-smb/?ir=1");
		Thread.sleep(4500);
		
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='region-selector_button']")))
		.build().perform();
		Thread.sleep(3400);
		
		int count=driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='row columns-wrapper ']"))
				.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		System.out.println();
		
		for(int i=0;i<count;i++)
		{
			builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='region-selector_button']")))
			.build().perform();
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[@class='utility-bar']//div[@class='row columns-wrapper ']"))
			.findElements(By.tagName("a")).get(i).click();
			System.out.println(i);
			System.out.println();
			Thread.sleep(3400);
			//Wait time 
			

		}
		Thread.sleep(4500);
		driver.close();

}


@Test()
public void ContactUsSelect2() throws InterruptedException
{	
	test=extent.createTest("Contact Us Select 2");
	WebDriver driver=Login();
	driver.get(url());
	//Thread.sleep(2000);
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']"))).build().perform();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu flyout-menu ']//li[2]")).click();
	Thread.sleep(5000);
	driver.close();
}
@Test()
public void ContactUsSelect3() throws InterruptedException
{	
	test=extent.createTest("Contact Us select 3");
	WebDriver driver=Login();
	driver.get(url());
	Thread.sleep(100);
	
	Actions builder=new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//div[@class='utility-bar']//a[@href='#']"))).build().perform();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu flyout-menu ']//li[4]//a")).click();
	Thread.sleep(4500);

	driver.findElement(By.id("UserFirstName")).sendKeys("Rakshit");
	driver.findElement(By.id("UserLastName")).sendKeys("Mitra");
	driver.findElement(By.xpath("//select[@id='UserTitle']/following-sibling::a//span[1]")).click();
	/*Select s =new Select(driver.findElement(By.id("UserTitle")));
	//s.selectByIndex(4);
	s.selectByValue("IT_Manager_AP");
//	s.se
	*/
	
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][1]//li[3]")).click();
	
	//Select Box Selection Over
	
	driver.findElement(By.id("UserEmail")).sendKeys("Rakee2@gmail.com");
	driver.findElement(By.id("UserPhone")).sendKeys("9946868989");
	driver.findElement(By.id("CompanyName")).sendKeys("ManesrTechnologies");
	
	//Selecting the Number of Employees
	driver.findElement(By.xpath("//select[@id='CompanyEmployees']/following-sibling::a")).click();
	
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][2]//li[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//select[@name='CompanyCountry']/following-sibling::a")).click();
//	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][4]//li[15]")).click();
	//driver.findElement(By.xpath("//select[@name='CompanyCountry']/following-sibling::a")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.querySelectorAll('ul[class=\"selectBox-dropdown-menu selectBox-options\"]')[3].scrollTop=900");
	driver.findElement(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options'][4]//li[45]")).click();
	

	Thread.sleep(45000);
	driver.close();
	
	

	
}
@Test()
public void LoginClick() throws InterruptedException
{	
	test=extent.createTest("Login Click");
	WebDriver driver=Login();
	//driver.get(url());
	
	driver.get("https://www.salesforce.com/in/cro/index-smb/?ir=1");
		Actions builder=new Actions(driver);
		ArrayList<String> al=new ArrayList();
		
		
		//    xpath for login   //div[@class='global-nav-login-flydown global-login']

		builder.moveToElement(driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']")))
		.build().perform();
		
		Thread.sleep(4500);
		
	int count=	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
		.findElements(By.tagName("a")).size();
	System.out.println(count);
	
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(0).click();
	Thread.sleep(2300);
	Set<String> win=driver.getWindowHandles();
	Iterator<String> itr=win.iterator();
	
		//driver.close();
		//Lower xpath //div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']
		
	while(itr.hasNext())
	{
		al.add(itr.next());
	}
	
	driver.switchTo().window(al.get(1));
	Thread.sleep(4500);
	driver.close();
	driver.switchTo().window(al.get(0));
	
	al.clear();
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(1).click();
	Thread.sleep(2300);
	Set<String> win1=driver.getWindowHandles();
	Iterator<String> itr1=win1.iterator();
	while(itr1.hasNext())
	{
		al.add(itr1.next());
		
	}

	driver.switchTo().window(al.get(1));
	Thread.sleep(4500);
	driver.close();
	driver.switchTo().window(al.get(0));
	al.clear();
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(2).click();
	Thread.sleep(2400);
	Set<String> win2=driver.getWindowHandles();
	Iterator<String> itr2=win2.iterator();
	while(itr2.hasNext())
	{
		al.add(itr2.next());
	}
	
	driver.switchTo().window(al.get(1));
	Thread.sleep(4500);
	driver.close();
	
	driver.switchTo().window(al.get(0));
	al.clear();
	
	driver.findElement(By.xpath("//div[@class='col text-left col-sm-4 col-md-4 col-lg-4']//div[@class='footer-social-links']"))
	.findElements(By.tagName("a")).get(3).click();
	Thread.sleep(4500);
	
	Set<String> win3=driver.getWindowHandles();
	Iterator<String> itr3=win3.iterator();
	
	while(itr3.hasNext())
	{
		al.add(itr3.next());
	}
		
	driver.switchTo().window(al.get(1));
	Thread.sleep(3500);
	driver.close();
	driver.switchTo().window(al.get(0));
	al.clear();
	Thread.sleep(1000);
	
	driver.close();
	
	
	

	
}




}
