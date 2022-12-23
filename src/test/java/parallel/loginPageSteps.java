package parallel;


import com.pages.LoginPage;
import factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class loginPageSteps {
	
	private static String title;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());




	@Given("User is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://guncel.vercel.app/");
		loginPage.clikGiris();
		
	   
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	   
	}

	@When("User enters password {string}")
	public void user_enters_password(String passwd) {
		loginPage.enterPassword(passwd);
	  
	}

	@When("User cliks on Continue button")
	public void user_cliks_on_continue_button() {
		loginPage.clickContinue();
	  
	}

	@Then("User gets title of the page")
	public void user_gets_title_of_the_page() {
	   
	}

	@Then("Page title shoul be {string}")
	public void page_title_shoul_be(String expectedTitleName) {
		String title = loginPage.getTitle();
		System.out.println("Page title is: "+ title);
		Assert.assertTrue(title.contains(expectedTitleName));

	}
	
	
}
