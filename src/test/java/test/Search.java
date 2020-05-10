package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchPage;

public class Search extends utility.Test {
	WebDriver driver;
	
	@Test(dataProvider="SearchProvider")
	public void searchGoogle(Integer i, String s) {
		System.out.println("Test");
		System.out.println("Test " + i + " " + s);
		SearchPage searchPage=new SearchPage(driver);
		searchPage.search(s);
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","D:\\\\Rohit Shree Backup\\\\Selenium Testing\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.close();
	}
	
	
	
	

}
