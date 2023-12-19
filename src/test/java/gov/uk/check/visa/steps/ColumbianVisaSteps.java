package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class ColumbianVisaSteps {
    @And("Select a Nationality Colombia")
    public void selectANationalityColombia() {
        new SelectNationalityPage().selectNationalty("Colombia");
    }

    @And("Select reason Join partner or family for a long stay")
    public void selectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().reasonForToursim("Join partner or family for a long stay");
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {

    }

    @And("verify result You’ll need a visa to join your family or partner in the UK")
    public void verifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        Assert.assertEquals(new ResultPage().getTextYouMayNeedVisa(),"You may need a visa","Message not verify");
    }
}
