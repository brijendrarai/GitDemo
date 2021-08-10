package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.HomePage;
import util.DriverUtil;

public class SeleniumPracticeStepDefinitation extends DriverUtil{

	//WebDriver driver;
	HomePage home;

	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
		driver = DriverUtil.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("User serach for {string} vegitable")
	public void user_serach_for_vegitable(String vegitable) throws InterruptedException {

		home = new HomePage(driver);
		home.getSearch().sendKeys(vegitable);
		Thread.sleep(2000);
	}

	@Then("{string} results are displayed")
	public void results_are_displayed(String arg1) {
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
	}

	@When("added items to cart")
	public void added_items_to_cart() {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'ADD TO ART')]")).click();

	}

	@When("user proceeded to checkout page for purchase")
	public void user_proceeded_to_checkout_page_for_purchase() {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

	@Then("verify selected {string} items are displayed in check out page")
	public void verify_selected_items_are_displayed_in_check_out_page(String string) {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(string));
	}

}
