package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ChileanVisaApplicationSteps {
    @And("Select a Nationality Chile")
    public void selectANationalityChile() {
        new SelectNationalityPage().selectNationalty("chile");
    }

    @And("Select reason Work academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().reasonForToursim("Work, academic visit or business");
    }

    @And("Select intendent to stay for {string}")
    public void selectIntendentToStayForLongerThanMonths(String stayLenth) {
        new DurationOfStayPage().stayPeriod("longer than 6 months");
    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new DurationOfStayPage().workOption("Health and care professional");
    }

    @Then("verify result You need a visa to work in health and care")
    public void verifyResultYouNeedAVisaToWorkInHealthAndCare() {
        Assert.assertEquals(new ResultPage().getTextFromVisa(),"You need a visa to work in health and care","Wrong verify message");
    }
}

