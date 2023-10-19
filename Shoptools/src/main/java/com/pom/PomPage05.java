package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage05 {
	public static WebDriver driver; // null driver

	public PomPage05(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
			
	}
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']" )   //click
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	
	

}
