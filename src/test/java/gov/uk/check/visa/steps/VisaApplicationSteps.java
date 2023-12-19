package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaApplicationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickOnStartButton();
    }

    @And("Select a Nationality {string}")
    public void selectANationalityAustralia() {
     new SelectNationalityPage().selectNationalty("australia");
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("Select reason {string}")
    public void selectReasonTourism() {
        new ReasonForTravelPage().reasonForToursim("Tourism or visiting family and friends");
    }

    @And("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK() {
        Assert.assertEquals(new ReasonForTravelPage().getTextFromVisa(),"You will not need a visa to come to the UK","Message Not Verify");
    }

}
