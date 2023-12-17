package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class ClaimTest extends BaseTest{
    /**
     * 1. Open section Claim.
     * 2. Click on cell From Date.
     * 3. Input incorrect data format.
      */
    @Test
    @Description("")
    @Tag("")
    public void wrongDateFormat() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.iconClaim.click();
        app.claimPage.fromDateTextBox.click();
        app.claimPage.fromDateTextBox.setValue("ffff");
        app.claimPage.space.click();
        app.claimPage.errorMessage.shouldBe(Condition.visible);
    }



}
