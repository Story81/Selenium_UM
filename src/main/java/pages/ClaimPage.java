package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClaimPage extends BasePage {

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
    public SelenideElement monthFromDate = $(byXpath("//div[@class ='oxd-calendar-selector-month-selected']/p"));
    public SelenideElement listOfDate = $(byXpath("//div[@class='oxd-calendar-dates-grid']"));
    public SelenideElement defaultMonth = $(byXpath("//div[@class='oxd-calendar-selector-month-selected']/p"));
    public SelenideElement defaultYear = $(byXpath("//div[@class='oxd-calendar-selector-year-selected']/p"));
    public SelenideElement defaultDayToday = $(byXpath("//div[@class='oxd-calendar-date --selected --today']"));
    public SelenideElement defaultDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));
    public SelenideElement salectedDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));
    public SelenideElement previousMonth = $(byXpath("(//p[@class='oxd-text oxd-text--p'])[1]"));

      public void openClaimPage() {
        iconClaim.click();
    }

    public void openCalendarFromDate() {
        calendarBtn.click();
        calendar.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }

    public void selectDate(String date) {
        SelenideElement exactDate = $(byXpath("(//div[@class='oxd-calendar-date'])[" + date + "]"));
        exactDate.click();
    }

    //
//    public String getPreviousMonth() {
//        java.util.Calendar cal = java.util.Calendar.getInstance();
//        String currentMonth = (new SimpleDateFormat("MM").format(cal.getTime()));
//        String prevMonth = String.valueOf(Integer.parseInt(currentMonth) - 1);
//        String previousMonth =  ((prevMonth, java.util.Calendar.LONG, Locale.ENGLISH ));
//
//        return previousMonth;
//    }
    public String getCurrentMonth() {
        java.util.Calendar c = java.util.Calendar.getInstance();
        String currentMonth = (c.getDisplayName(java.util.Calendar.MONTH, java.util.Calendar.LONG, Locale.ENGLISH));
        return currentMonth;
    }

    public String getCurrentYear() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        String currentYear = (new SimpleDateFormat("yyyy").format(cal.getTime()));
        return currentYear;
    }

    public String getCurrentDay() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        String currentDay = (new SimpleDateFormat("dd").format(cal.getTime()));
        return currentDay;
    }
}
