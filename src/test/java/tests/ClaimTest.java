package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;

public class ClaimTest extends BaseTest{
    /**
     * 1. Open section Claim.
     * 2. Click on cell From Date.
     * 3. Input incorrect data format.
      */
    @Test
    public void wrongDateFormat() throws InterruptedException {
        loginPage.login();
        claimPage.iconClaim.click();
        claimPage.fromDateTextBox.click();
        claimPage.fromDateTextBox.setValue("ffff");
        claimPage.space.click();
        claimPage.errorMessage.shouldBe(Condition.visible);

    }



}
