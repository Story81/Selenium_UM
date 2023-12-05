package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClaimPage extends BasePage{

    /**
     * Frontend elements found by xpass
     */
    public SelenideElement iconClaim = $(byXpath("//a[@href='/web/index.php/claim/viewClaimModule']"));
    public SelenideElement fromDateTextBox = $(byXpath("(//input[@placeholder='yyyy-mm-dd'])[1]"));
    public SelenideElement errorMessage = $(byXpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
    public SelenideElement space = $(byXpath("//div[@class='oxd-form-actions']"));

    public SelenideElement buttonSearch = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    public SelenideElement recordsFound = $(byXpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']"));
    public SelenideElement calendarBtn = $(byXpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]"));
    public SelenideElement calendar = $(byXpath("//div[@class='oxd-date-input-calendar']"));
    public SelenideElement leftArrowMonthBtn = $(byXpath("(//button[@class='oxd-icon-button'])[3]"));
    public SelenideElement fromDate = $(byXpath("//div[text()='25']/.."));
    public SelenideElement monthFromDate = $(byXpath("//p[text()='November']"));
    public SelenideElement listOfDate = $(byXpath("//div[@class='oxd-calendar-dates-grid']"));
    public SelenideElement defaultMonth = $(byXpath("//div[@class='oxd-calendar-selector-month-selected']/p"));
    public SelenideElement defaultYear = $(byXpath("//div[@class='oxd-calendar-selector-year-selected']/p"));
    public SelenideElement defaultDayToday = $(byXpath("//div[@class='oxd-calendar-date --selected --today']"));
    public SelenideElement defaultDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));
    public SelenideElement salectedDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));

    /**
     * Проверка "переход в секцию Claim
     */
    public void openClaimPage() {
        iconClaim.click();
    }
    public void openCalendar() {
        calendarBtn.click();
        calendar.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }
    public void checkDefaultMonthAndYear(String day, String month, String year) {
        defaultDayToday.shouldHave(Condition.exactText(day), Duration.ofSeconds(5));
        defaultMonth.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
        defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
    }
}
