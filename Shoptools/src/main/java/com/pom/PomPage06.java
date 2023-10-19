package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage06 {
	public static WebDriver driver; // null driver

	public PomPage06(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
			
	}
	@FindBy(xpath = "//input[@id='billing_first_name']" )   //sendkeys   Lucky
	private WebElement first;

	@FindBy(xpath = "//input[@id='billing_last_name']" )   //sendkeys   Bo
	private WebElement last ;
	
	@FindBy(xpath = "//input[@id='billing_company']" )   //sendkeys   XYZ Company
	private WebElement company;

	@FindBy(xpath = "//input[@id='billing_address_1']" )   //sendkeys   No.1139 Addison street
	private WebElement address1 ;

	@FindBy(xpath = "//input[@id='billing_address_2']" )   //sendkeys   Brekeley CA 94702
	private WebElement address2;

	@FindBy(xpath = "//input[@id='billing_city']" )   //sendkeys   Brekeley  
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='billing_postcode']" )   //sendkeys    
	private WebElement postcode;

	@FindBy(xpath = "//input[@id='billing_phone']" )   //sendkeys    
	private WebElement phone;

	@FindBy(xpath = "//input[@id='billing_email']" )   //sendkeys    lucky29bo@gmail.com
	private WebElement email;

	@FindBy(xpath = "//input[@id='terms']" )   //click
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@id='place_order']" )   //click  
	private WebElement placeorder;

	
	
	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	//quit

}
