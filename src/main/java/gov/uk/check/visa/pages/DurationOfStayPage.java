package gov.uk.check.visa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DurationOfStayPage {
    @CacheLookup@FindBy(xpath = "//div[@class='govuk-radios']")
    List<WebElement> stayOption;
    @CacheLookup@FindBy(xpath = "//div[@class='govuk-radios']")List<WebElement> work;

    public void stayPeriod(String stay){
        for (WebElement a: stayOption  ) {
            if (a.getText().equalsIgnoreCase(stay)){
                a.click();
                break;
            }

        }

    }
    public void workOption(String option){
        for (WebElement c : work  ) {
            if (c.getText().equalsIgnoreCase(option)) {
            c.click();
            break;
            }

        }
    }


    }


