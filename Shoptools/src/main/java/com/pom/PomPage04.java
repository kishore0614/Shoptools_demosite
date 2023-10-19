package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage04 {
	public static WebDriver driver; // null driver

	public PomPage04(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
			
	}
	@FindBy(xpath = "//select[@id='pa_color']" )   //click
	private WebElement colour;
	
	@FindBy(xpath = "//select[@id='pa_size']" )   //click
	private WebElement size;
	
	@FindBy(xpath = "//button[text()='Add to cart']" )   //click
	private WebElement add;

	@FindBy(xpath = "//i[@class='icon_bag_alt']" )   //click
	private WebElement cart;

	public WebElement getColour() {
		return colour;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCart() {
		return cart;
	}
	
		

}
