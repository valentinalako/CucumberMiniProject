package qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import qa.pages.BlazeDemoWebElements;
import qa.utils.Constants2;

public class BdemoPurchaseTicket {
	BlazeDemoWebElements blazeDemo;

	@Given("User navigates to Register Page {string}")
	public void user_navigates_to_register_page(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants2.driver = new ChromeDriver();
		Constants2.driver.manage().window().maximize();
		Constants2.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants2.driver.get(url);
		Thread.sleep(2000);
		blazeDemo= new BlazeDemoWebElements();
		Actions actions=new Actions(Constants2.driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
	}

	@When("User enters Full Name {string}")
	public void user_enters_full_name(String firstName) {
		blazeDemo.enterFirstLastName(firstName);
	}

	@When("User enters Address {string}")
	public void user_enters_address(String address) {
		blazeDemo.enterAddress(address);
	}

	@When("User enters City {string}")
	public void user_enters_city(String city) {
		blazeDemo.enterCityname(city);
	}

	@When("User enters State {string}")
	public void user_enters_state(String state) {
		blazeDemo.enterStateName(state);

	}

	@When("User enters ZipCode {string}")
	public void user_enters_zip_code(String zipCode) {
		blazeDemo.enterZipCodeNumber(zipCode);

	}

	@When("User selects CardType {string}")
	public void user_selects_card_type(String cardType) {
		blazeDemo.enterCardType(cardType);

	}

	@When("User enters CreditCardNumber {string}")
	public void user_enters_credit_card_number(String creditCardNumber) {
		blazeDemo.enterCreditCardNumber(creditCardNumber);

	}

	@When("User enters CreditCardMonth {string}")
	public void user_enters_credit_card_month(String creditCardMonth) throws InterruptedException {
		blazeDemo.enterCreditMonth(creditCardMonth);

	}

	@When("User enters CreditCardYear {string}")
	public void user_enters_credit_card_year(String creditCardYear) throws InterruptedException {
		blazeDemo.enterCreditYear(creditCardYear);

	}

	@When("User enters NameOnCard {string}")
	public void user_enters_name_on_card(String nameOnCard) {
		blazeDemo.enterNameOnCard(nameOnCard);
	}

	@When("User clicks RememberMe")
	public void user_clicks_remember_me() {
		blazeDemo.clickrememberMe();

	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() {
		blazeDemo.clickSumbitButton();

	}

	@Then("User verify the message confirmation  {string}")
	public void user_verify_the_message_confirmation(String getMessage) throws InterruptedException {
		blazeDemo.showedMessage(getMessage);
		Thread.sleep(2000);
		Constants2.driver.quit();
	}


}
