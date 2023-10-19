package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\DIVI\\eclipse-workspace\\Shoptools\\src\\test\\java\\com\\feature\\ShopTools.feature" , 
                 glue ="com.stepdefination",
                 plugin = {"html:target/ShopTools.html"})
public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
    public static void startTheProgram() {
		
		driver=BaseClass.browser("chrome");

	}
	
}
