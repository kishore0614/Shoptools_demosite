package com.stepdefination;

import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.Page_object_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends BaseClass {
	
	Page_object_manager pom = new Page_object_manager(driver);
	
	
	@Given("User Launch the url")
	public void user_launch_the_url() throws InterruptedException {
		getUrl("https://shop.demoqa.com/");
		Thread.sleep(2000);
	}
	@When("User Click the product\\(T-shirt)")
	public void user_click_the_product_t_shirt() throws InterruptedException {
	    pom.getPomPage01().getTshirt().click();
	    Thread.sleep(2000);
		
	}
	@Then("Next page shown")
	public void next_page_shown() {
	    
	}
	
	

     @When("User Select Colour for T-Shirt")
     public void user_select_colour_for_t_shirt() {
    	 Select s = new Select(pom.getPomPage02().getColour());
    	 s.selectByValue("pink");
   
    }
    @When("User Select Size for T-Shirt")
    public void user_select_size_for_t_shirt() {
    	Select s1 = new Select(pom.getPomPage02().getSize());
    	s1.selectByValue("36");
    
    }
    @When("User Added T-Shirt into cart")
    public void user_added_t_shirt_into_cart() throws InterruptedException {
    	pom.getPomPage02().getAdd().click();
    	Thread.sleep(2000);
    
    }

    @When("User Navigate to Home Page")
    public void user_navigate_to_home_page() throws InterruptedException {
    	pom.getPomPage02().getHome().click();
    	Thread.sleep(2000);
   
    }
    @Then("Next Page Shown1")
    public void next_page_shown1() {
   
	
    }

    @When("User Click the Product\\(maxi dress)")
    public void user_click_the_product_maxi_dress() {
    	pom.getPomPage03().getMaxi().click();
    	
    
    }
    @Then("Next Page Shown2")
    public void next_page_shown2() throws InterruptedException {
    	Thread.sleep(2000);
    	
    }
    

    @When("User Select Colour for maxi dress")
    public void user_select_colour_for_maxi_dress() {
    	Select s3 = new Select(pom.getPomPage04().getColour());
    	s3.selectByValue("red");
      
    }
    @When("User Select Size for maxi dress")
    public void user_select_size_for_maxi_dress() {
    	Select s4 = new Select(pom.getPomPage04().getSize());
    	s4.selectByValue("medium");
    
    }
    @When("User Added maxi dress into cart")
    public void user_added_maxi_dress_into_cart() {
    	pom.getPomPage04().getAdd().click();
    
    }
    @When("User Click Bag button")
    public void user_click_bag_button() {
    	pom.getPomPage04().getCart().click();
    	
    }    
    @Then("Next Page Shown3")
    public void next_page_shown3() throws InterruptedException {
    	Thread.sleep(2000);
    
    }
    
    
    
    @When("User Click Checkout Button")
    public void user_click_checkout_button() {
    	pom.getPomPage05().getCheckout().click();
        
    }
    @Then("Next Page Shown4")
    public void next_page_shown4() throws InterruptedException {
    	Thread.sleep(2000);
    	
    }
    
    
    @When("User Enter First name")
    public void user_enter_first_name() {
    	pom.getPomPage06().getFirst().sendKeys("Lucky");
        
    }
    @When("User Enter Last name")
    public void user_enter_last_name() {
    	pom.getPomPage06().getLast().sendKeys("Bo");

    }
    @When("User Enter Company")
    public void user_enter_company() {
    	pom.getPomPage06().getCompany().sendKeys("XYZ Company");
        
    }
    @When("User Enter address1")
    public void user_enter_address1() {
    	pom.getPomPage06().getAddress1().sendKeys("No.1139 Addison street");
        
    }
    @When("User Enter address2")
    public void user_enter_address2() {
    	pom.getPomPage06().getAddress2().sendKeys("Brekeley CA 94702");
        
    }
    @When("User Enter City")
    public void user_enter_city() {
    	pom.getPomPage06().getCity().sendKeys("Brekeley");
        
    }
    @When("User Enter Postcode")
    public void user_enter_postcode() {
    	pom.getPomPage06().getPostcode().sendKeys("789456");
        
    }
    @When("User Enter Phone no")
    public void user_enter_phone_no() {
    	pom.getPomPage06().getPhone().sendKeys("74185209630");
        
    }
    @When("User Enter Email")
    public void user_enter_email() {
    	pom.getPomPage06().getEmail().sendKeys("lucky29bo@gmail.com");
        
    }
    @When("User Click Checkbox")
    public void user_click_checkbox() {
    	pom.getPomPage06().getCheckbox().click();
        
    }
    @When("User Click PlaceOrder")
    public void user_click_place_order() {
    	pom.getPomPage06().getPlaceorder().click();
        
    }
    @Then("Next Page Shown5")
    public void next_page_shown5() throws InterruptedException {
    	Thread.sleep(4000);
    	quit();
    	
        
    }
}
