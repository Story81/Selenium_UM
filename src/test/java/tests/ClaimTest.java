package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;

public class ClaimTest extends BaseTest {
    /**
     * 1. Open section Claim.
     * 2. Click on cell From Date.
     * 3. Input incorrect data format.
     */
    @Test
    public void wrongDateFormat() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.iconClaim.click();
        app.claimPage.fromDateTextBox.click();
        app.claimPage.fromDateTextBox.setValue("ffff");
        app.claimPage.space.click();
        app.claimPage.errorMessage.shouldBe(Condition.visible);
    }

    /**
     * Проверка "Открытие календаря"
     */
    @Test
    public void openCalendar() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendar();
    }


    /**
     * Проверка "Выбор даты в поле From Date"
     * 1. Открыть календарь
     * 2. Кликнуть на стрелку влево (выбран - ноябрь)
     * 3. Выбрать число (25)
     * 4. Проверить,что число, месяц и год выбраны верно
     */
    @Test
    public void selectMonthInFromDate() {
        String year = "2023";
        String month = "November";
        String day = "2";
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendar();
        app.claimPage.leftArrowMonthBtn.click();
        app.claimPage.monthFromDate.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
        app.claimPage.fromDate.shouldBe(Condition.visible, Duration.ofSeconds(5));
        app.claimPage.listOfDate.getWrappedElement().findElement(byText(day)).click();
        app.claimPage.calendarBtn.click();
        app.claimPage.defaultDay.shouldHave(Condition.exactText(day), Duration.ofSeconds(5));
        app.claimPage.defaultMonth.shouldHave(Condition.exactText(month), Duration.ofSeconds(5));
        app.claimPage.defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
    }
    /**
     * Проверка "Выбор дня в поле From Date"
     * 1. Открыть календарь
     * 2. Выбрать число (1)
     * 3. Проверить, что число выбрано верно
     */
    @Test
    public void selectDateInFromDate() {
        String date = "1";
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendar();
        app.claimPage.fromDate.shouldBe(Condition.visible, Duration.ofSeconds(5));
        app.claimPage.listOfDate.getWrappedElement().findElement(byText(date)).click();
        app.claimPage.calendarBtn.click();
        app.claimPage.defaultDay.shouldHave(Condition.exactText(date), Duration.ofSeconds(5));
    }

    /**
     * Проверка "Отображение даты в календаре по умолчанию"
     * 1. Открыть календарь
     * 2. Проверить число, месяц, год
     */
    @Test
    public void checkMonthAndYear() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendar();
        app.claimPage.checkDefaultMonthAndYear("5","December", "2023");
    }
}
