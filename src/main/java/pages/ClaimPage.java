package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClaimPage {

    /**
     * Frontend elements found by xpass
     */
    public SelenideElement iconClaim = $(byXpath("//a[@href='/web/index.php/claim/viewClaimModule']"));
    public SelenideElement fromDateTextBox = $(byXpath("//div[@class='oxd-date-input']"));
    public SelenideElement space = $(byXpath("//div[@class='oxd-form-actions']"));
    public SelenideElement errorMessage = $(byXpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
    public SelenideElement fromDateCalendarMonth = $(byXpath("//li[@class='oxd-calendar-selector-month']"));
    public SelenideElement fromDateSelectedMonth = $(byXpath("//ul[@class='oxd-calendar-dropdown']"));
    public SelenideElement fromDateSelectingYear = $(byXpath("//li[@class='oxd-calendar-dropdown--option --selected']"));
    public SelenideElement fromDateCalendar = $(byXpath("//div[@class='oxd-calendar-dates-grid']"));
    public SelenideElement buttonSearch = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
//    public SelenideElement recordsFound = $(byXpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']"));

}
