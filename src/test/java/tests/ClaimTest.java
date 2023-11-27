package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class ClaimTest extends BaseTest{
    /**
     * Input of incorrect data format
     */
    @Test
    public void wrongDateFormat(){
        claimPage.iconClaim.click();
        claimPage.fromDate.click();
        claimPage.fromDate.setValue("efefe");
        claimPage.space.click();
        claimPage.errorMessage.shouldBe(Condition.visible);
    }
}
