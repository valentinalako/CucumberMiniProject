package qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.utils.Constants2;

public class BlazeDemoWebElements {
	
	@FindBy(id="inputName")
	WebElement firstLastNameField;
	
	@FindBy(id="address")
	WebElement addressField;
	
	@FindBy(id="city")
	WebElement cityField;
	
	@FindBy(id="state")
	WebElement stateField;
	
	@FindBy (id="zipCode")
	WebElement zipCodeField;
	
	@FindBy(id="cardType")
	WebElement cardTypeField;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumberField;
	
	@FindBy (id="creditCardMonth")
	WebElement creditCardMonthField;
	
	@FindBy(id="creditCardYear")
	WebElement creditCardYearField;
	
	@FindBy(id="nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy(id="rememberMe")
	WebElement rememberMeField;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//h1[contains(text(),'Thank you for your purchase today!')]")
	WebElement getMessage1;
	
	
	
	public BlazeDemoWebElements (){
		PageFactory.initElements(Constants2.driver, this);
	}
	public void enterFirstLastName(String firstName) {
		firstLastNameField.sendKeys(firstName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}
	public void enterCityname(String cityName) {
		cityField.sendKeys(cityName);
	}
	public void enterStateName(String stateName) {
		stateField.sendKeys(stateName);
	}	
	
	public void enterZipCodeNumber(String zipCode) {
	zipCodeField.sendKeys(zipCode);
	
	}
	public void enterCardType(String cardType) {
		creditCardMonthField.clear();
		
		Select select = new Select (cardTypeField);
		List<WebElement> optionList = select.getOptions();
		for (WebElement el : optionList) {
			String elText = el.getText();
			if (elText.equals(cardType)) {
				el.click();
				break;
			}
		}
	}
	public void enterCreditCardNumber(String creditCardNumber) {
		
		creditCardNumberField.sendKeys(creditCardNumber);
		
		
	}
	public void enterCreditMonth(String creditCardMonth) {
		creditCardMonthField.sendKeys(creditCardMonth);
	}
	public void enterCreditYear(String creditCardYear) throws InterruptedException {
		creditCardYearField.clear();
		Thread.sleep(1000);
		creditCardYearField.sendKeys(creditCardYear);
	}
	public void enterNameOnCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);
	}
	public void clickrememberMe() {
		rememberMeField.click();
	}
	
	public void clickSumbitButton() {
		submitButton.click();
	}
	public void showedMessage(String getMessage2){
		String text = getMessage1.getText();
		if (getMessage2.equalsIgnoreCase(text)) {
			System.out.println("Page Title is: " + text);
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
	
	}


}
