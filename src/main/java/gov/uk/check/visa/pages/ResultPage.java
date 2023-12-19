package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement textVisaForHealth;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='You may need a visa']")WebElement textYouMayNeedVisa;


    public String getTextFromVisa(){
        String message = getTextFromElement(textVisaForHealth);
        return message;
    }

    public String getTextYouMayNeedVisa(){
        String message = getTextFromElement(textYouMayNeedVisa);
        return message;
    }
}
