package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.DriverUtil;

public class Hooks extends DriverUtil{
	
	@Before("@MobileTest")
	public void mobileBefore() {
		System.out.println("before mobile hook");
		System.out.println("git 1");
		System.out.println("git 2");
		System.out.println("git 3");
		System.out.println("git 4");
	}
	
	@After("@MobileTest")
	public void mobileAfter() {
		System.out.println("after mobile hook");
	}
	
	@After("@SeleniumPractice")
	public void SeleniumAfter() {
		driver.close();
	}
	
	@Before("@WebTest")
	public void webBefore() {
		System.out.println("before web hook");
	}
	
	@After("@WebTest")
	public void webAfter() {
		System.out.println("after web hook");
	}

}
