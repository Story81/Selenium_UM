package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class ClaimPage extends BasePage {
    public SelenideElement s = $x("");
    public SelenideElement sectionClaim = $x("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]");
    public SelenideElement calendarBtn = $x("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");
    public SelenideElement calendar = $x("//div[@class='oxd-date-input-calendar']");
    public SelenideElement leftArrowMonthBtn = $x("(//button[@class='oxd-icon-button'])[3]");
    public SelenideElement fromDate = $x("//div[text()='25']/..");
    public SelenideElement monthFromDate = $x("//p[text()='November']");
    public SelenideElement list = $x("//div[@class='oxd-calendar-dates-grid']");
    public SelenideElement defaultMonth = $x("//div[@class='oxd-calendar-selector-month-selected']/p");
    public SelenideElement defaultYear = $x("//div[@class='oxd-calendar-selector-year-selected']/p");
    public SelenideElement defaultDayToday = $x("//div[@class='oxd-calendar-date --selected --today']");
    public SelenideElement defaultDay = $x("//div[@class='oxd-calendar-date --selected']");

    /**
     * Проверка "переход в секцию Claim
     */
    public void openClaimPage() {
        sectionClaim.click();
    }

    /**
     * Проверка "Открытие календаря"
     */
    public void openCalendar() {
        calendarBtn.click();
        calendar.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }

    /**
     * Проверка "Выбрать дату в поле From Date
     * 1. Открыть календарь
     * 2. Кликнуть на стрелку влево (ноябрь)
     * 3. Выбрать число (25)
     * 4. Проверить,что число, месяц и год выбраны верно
     */
    public void selectFromDate() {
        leftArrowMonthBtn.click();
        fromDate.click();
        monthFromDate.shouldHave(Condition.exactText("November"), Duration.ofSeconds(5));
        fromDate.shouldBe(Condition.visible, Duration.ofSeconds(5));
        list.getWrappedElement().findElement(byText("25")).click();
        calendarBtn.click();
        defaultDay.shouldHave(Condition.exactText("25"), Duration.ofSeconds(5));
        defaultMonth.shouldHave(Condition.exactText("November"), Duration.ofSeconds(5));
        defaultYear.shouldHave(Condition.exactText("2023"), Duration.ofSeconds(5));
    }

    /**
     * Проверка "Отображение даты в календаре по умолчанию"
     * 1. Открыть календарь
     * 2. Проверить число, месяц, год
     */
    public void checkMonthAndYear(String day, String month, String year) {
        defaultDayToday.shouldHave(Condition.exactText(day), Duration.ofSeconds(5));
        defaultMonth.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
        defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
    }
}

