package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SignInPage;

public class SignIn {
	
WebDriver driver;
	
	@Test
	public void signIn() {
		System.out.println("Test");
		SignInPage signInPage=new SignInPage(driver);
		signInPage.enterText("TestFirst","TestLast", "TestRohittest", "test123");		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","D:\\\\Rohit Shree Backup\\\\Selenium Testing\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.close();
	}
}
