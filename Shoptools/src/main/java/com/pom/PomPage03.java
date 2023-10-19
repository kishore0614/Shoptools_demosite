package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomPage03 {
	public static WebDriver driver;

	public PomPage03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
			
	}
	@FindBy(xpath = "//a[text()='red satin round neck backless maxi dress']" )   //click
	private WebElement maxi;

	public WebElement getMaxi() {
		return maxi;
	}
	
		
		
	

}
