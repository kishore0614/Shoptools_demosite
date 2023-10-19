package com.pom;

import org.openqa.selenium.WebDriver;



public class Page_object_manager {
	
	public static WebDriver driver;
	
	private PomPage01 a;
	
	private PomPage02 b;
	
	private PomPage03 c;
	
	private PomPage04 d;
	
	private PomPage05 e;
	
	private PomPage06 f;
	
	
	
	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public PomPage01 getPomPage01() { 
		a = new PomPage01(driver);
		return a;
		
	}
	public PomPage02 getPomPage02() {
		b = new PomPage02(driver);
		return b;
		
	}
	public PomPage03 getPomPage03() {
		c = new PomPage03(driver);
		return c;
		
	}
	public PomPage04 getPomPage04() {
		d = new PomPage04(driver);
		return d;

	}
	public PomPage05 getPomPage05() {
		e = new PomPage05(driver);
		return e;
		
	}
	public PomPage06 getPomPage06() {
		f = new PomPage06(driver);
		return f;
		
	}

}
