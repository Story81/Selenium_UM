package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;

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
        app.claimPage.openCalendarFromDate();
    }

    /**
     * Проверка "Выбор даты в поле From Date"
     * 1. Открыть календарь
     * 2. Кликнуть на стрелку влево (выбран предыдущий месяц). Проверяем что выбранный месяц в календаре не равен текущему.
     * 3. Выбрать число (2)
     * 4. Проверить, что выбранная ранее дата в календаре отображается верно
     * (для этого принимаем на вход текущую дату и парсим. В итоге получаем текущий год)
     */
    @Test
    public void selectMonthInFromDate() {
        String expression = String.valueOf((LocalDateTime.now()));
        String year = String.valueOf(Integer.parseInt(expression.substring(0, 4)));

        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendarFromDate();
        String currentMonth = app.claimPage.monthFromDate.getText();
        app.claimPage.leftArrowMonthBtn.click();
        app.claimPage.monthFromDate.shouldNotHave(Condition.exactText(currentMonth), Duration.ofSeconds(5));
        app.claimPage.fromDate.shouldBe(Condition.visible, Duration.ofSeconds(5));
        app.claimPage.listOfDate.getWrappedElement().findElement(byText("2")).click();
        app.claimPage.calendarBtn.click();
        app.claimPage.defaultDay.shouldHave(Condition.exactText("2"), Duration.ofSeconds(5));
        String previousMonth = app.claimPage.previousMonth.getText();
        app.claimPage.defaultMonth.shouldHave(Condition.exactText(previousMonth), Duration.ofSeconds(5));
        app.claimPage.defaultYear.shouldHave(Condition.exactText(year), Duration.ofSeconds(5));
    }

    /**
     * Проверка "Выбор дня текущего месяца в поле From Date"
     * 1. Открыть календарь
     * 2. Выбрать число (1)
     * 3. Проверить, что число выбрано верно
     */
    @Test
    public void selectDateInFromDate() {
        String date = "1";
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendarFromDate();
        app.claimPage.fromDate.shouldBe(Condition.visible, Duration.ofSeconds(5));
        app.claimPage.listOfDate.getWrappedElement().findElement(byText(date)).click();
        app.claimPage.calendarBtn.click();
        app.claimPage.defaultDay.shouldHave(Condition.exactText(date), Duration.ofSeconds(5));
    }

    /**
     * Проверка "Отображение даты в календаре по умолчанию"
     * 1. Открыть календарь
     * 2. Проверить число, месяц, год (парсим текущую полученную дату на число, месяц и год. Затем сверяем с тем, что отображается в календаре по умолчанию)
     */
    @Test
    public void checkMonthAndYear() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.openClaimPage();
        app.claimPage.openCalendarFromDate();
        app.claimPage.checkDefaultMonthAndYear();
    }
}
