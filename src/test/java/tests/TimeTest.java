package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class TimeTest extends BaseTest{

    /**
     * Section "Time" opens.
     * Click on dropmeny, choose "Timesheets".
     * Click in button "Edit".
     * Enter data for the Project cell, select an item from the drop menu.
     * Select a "QA Testing" from the drop menu of Activity.
     * Check the data to ensure it matches.
     * @throws InterruptedException
     */
    @Test
    public void selectFromActivityDropMenu() throws InterruptedException {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.timePage.iconTime.click();
        app.timePage.timesheets.click();
        app.timePage.dropMenu.click();
        app.timePage.editButton.click();
        app.timePage.cellProject.sendKeys(Keys.CONTROL + "a");
        app.timePage.cellProject.sendKeys(Keys.BACK_SPACE);
        app.timePage.cellProject.setValue("w");
        Thread.sleep(2000);
        app.timePage.chooseProject.click();
        app.timePage.activitySelect.click();
        Thread.sleep(1000);
        app.timePage.dropMenuActivity.getWrappedElement().findElement(byText("QA Testing")).click();
        app.timePage.selectedActivity.shouldHave(Condition.exactText("QA Testing"));
    }
}
