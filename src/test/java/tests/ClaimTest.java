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

public class ClaimTest extends BaseTest{
    /**
     * 1. Open section Claim.
     * 2. Click on cell From Date.
     * 3. Input of incorrect data format.
     */
    @Test
    public void wrongDateFormat() throws InterruptedException {
        loginPage.login();
        claimPage.iconClaim.click();
        claimPage.fromDateTextBox.click();
        claimPage.fromDateCalendarMonth.click();
        claimPage.fromDateSelectedMonth.getWrappedElement().findElement(byText("July")).click();
        claimPage.fromDateCalendar.getWrappedElement().findElement(byText("18")).click();
        claimPage.buttonSearch.click();
        List<WebElement> recordsFound = driver.findElements(By.className("orangehrm-horizontal-padding orangehrm-vertical-padding"));
        recordsFound.stream().filter(element -> element.getText().equals("6")).forEach(System.out::println);


    }
}
