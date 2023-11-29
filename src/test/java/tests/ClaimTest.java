package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class ClaimTest extends BaseTest{
    /**
     * 1. Open section Claim.
     * 2. Click on cell From Date.
     * 3. Input of incorrect data format.
     */
    @Test
    public void wrongDateFormat(){
        loginPage.login();
        claimPage.iconClaim.click();
        claimPage.fromDate.click();
        claimPage.fromDate.setValue("efefe");
        claimPage.space.click();
        claimPage.errorMessage.shouldBe(Condition.visible);
    }
}
