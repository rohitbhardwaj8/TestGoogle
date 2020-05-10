package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Page {
	By firstName=By.id("firstName");
	By lastName=By.id("lastName");
	By username=By.id("username");
	By password=By.name("Passwd");
	By confirmPassword=By.name("ConfirmPasswd");
	By nextBtn=By.xpath("//span[@class='CwaK9']/span");
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterText(String fname, String lname, String user, String pwd) {
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(pwd);
		driver.findElement(nextBtn).click();
	}
	
}
