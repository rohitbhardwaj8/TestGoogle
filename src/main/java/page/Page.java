package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page implements IPage {
	WebDriver driver;
	public Page(WebDriver driver) {
		this.driver=driver;
	}

	public void click(By b) {
		driver.findElement(b).click();
		
	}

	public void enterText(By b, String value) {
		driver.findElement(b).sendKeys(value);
	}

}
