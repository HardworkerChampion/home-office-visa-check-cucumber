package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    @CacheLookup@FindBy(id = "response-0")
    WebElement tourismOption;

    @CacheLookup@FindBy(xpath = "//div[@class='govuk-radios']")List<WebElement> tourismReason;
    @CacheLookup@FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
     WebElement textForVisa;
    public void selectReasonTourism(){
        clickOnElement(tourismOption);
    }
    public String getTextFromVisa(){
       String message = getTextFromElement(textForVisa);
       return message;
    }

    public void reasonForToursim(String reason){
        for (WebElement a: tourismReason  ) {
            if (a.getText().equalsIgnoreCase(reason)){
                a.click();
                break;
            }

        }
    }
}
