package utility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import testdata.Dp;

public class Test extends Dp {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit.");
		
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suit.");	
	}
}
