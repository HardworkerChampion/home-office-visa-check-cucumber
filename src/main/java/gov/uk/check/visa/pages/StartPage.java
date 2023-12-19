package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StartPage extends Utility {

    @CacheLookup@FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startButton;
    @CacheLookup@FindBy(id = "response")WebElement dropDown;




    public void clickOnStartButton(){
        clickOnElement(startButton);
    }
    public void verifyTheAvailableCountries(){
        String country;
        Select select = new Select(dropDown);
        List<WebElement> allOptions = select.getOptions();

        for (WebElement a :allOptions   ) {
            System.out.println(a.getText());
        }
    }


}
