package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	public static WebDriver driver; // null driver

	 public PomPage01(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
		}
	 
		@FindBy(xpath = "//a[text()='pink drop shoulder oversized t shirt']" )   //click
		private WebElement tshirt;

		public WebElement getTshirt() {
			return tshirt;
		}

}
	
	
