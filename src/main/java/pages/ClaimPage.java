package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.time.LocalDateTime;

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
    public SelenideElement monthFromDate = $(byXpath("//div[@class ='oxd-calendar-selector-month-selected']/p"));
    public SelenideElement listOfDate = $(byXpath("//div[@class='oxd-calendar-dates-grid']"));
    public SelenideElement defaultMonth = $(byXpath("//div[@class='oxd-calendar-selector-month-selected']/p"));
    public SelenideElement defaultYear = $(byXpath("//div[@class='oxd-calendar-selector-year-selected']/p"));
    public SelenideElement defaultDayToday = $(byXpath("//div[@class='oxd-calendar-date --selected --today']"));
    public SelenideElement defaultDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));
    public SelenideElement salectedDay = $(byXpath("//div[@class='oxd-calendar-date --selected']"));


    public SelenideElement previousMonth =$(byXpath("(//p[@class='oxd-text oxd-text--p'])[1]"));

    /**
     * Проверка "переход в секцию Claim
     */
    public void openClaimPage() {
        iconClaim.click();
    }
    public void openCalendarFromDate() {
        calendarBtn.click();
        calendar.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }
//    public void checkDefaultMonthAndYear(String day, String month, String year) {
//        defaultDayToday.shouldHave(Condition.exactText(day), Duration.ofSeconds(5));
//        defaultMonth.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
//        defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
//    }

    public void checkDefaultMonthAndYear() {
        String expression = String.valueOf((LocalDateTime.now()));
        String year;
        String month;
        String day;

        year = String.valueOf(Integer.parseInt(expression.substring(0, 4)));
        day = String.valueOf(Integer.parseInt(expression.substring(8, 10)));

        int monthDigits = Integer.parseInt(expression.substring(5, 7));
        switch (monthDigits) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "мMarch";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "wrong name";
        }
        defaultDayToday.shouldHave(Condition.exactText(day), Duration.ofSeconds(5));
        defaultMonth.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
        defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
    }
}
