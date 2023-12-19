package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(id = "response")
    WebElement selectCountry;
    @CacheLookup@FindBy(xpath = "//button[normalize-space()='Continue']")WebElement continueButton;
    public void selectNationalty(String country){
        selectByValueFromDropDown(selectCountry,country);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }



}
