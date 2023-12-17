package tests;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static pages.AdminPage.extractNumberFromString;

public class AdminTest extends BaseTest {


    @Test
    @Description("Admin tab click")
    @Tag("smoke")
    public void adminTabClick() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));
    }

    /**
     * Open  "Admin" Page
     * Click on the DropDownMenue
     * Get UserRole "Admin"
     * Click on the Button "Search".
     */
    @Test
    @Description("Click on the Button Search")
    @Tag("smoke")
    public void systemUsersSearchButton() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));
        app.adminPage.searchButton.click();
    }

    /**
     * Open "Admin" Page
     * Click on the Button "+Add".
     */
    @Test
    @Description("Click on the Button Add")
    @Tag("smoke")
    public void addButtonClick() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.addButton.click();
    }

    @Test
    @Description("Click on the enabled tab")
    @Tag("smoke")
    public void enabledTabClick() {
        app.loginPage.login("Admin", "admin123");
        app.adminPage.adminTab.click();
        app.adminPage.statusRoleButton.click();
        app.adminPage.statusRoleDropDown.getWrappedElement().findElement(byText("Enable")).click();
        app.adminPage.statusRoleInput.shouldHave(Condition.exactText("Enable"));
    }


    /**
     * +
     * Проверка работы фильтрации на странице
     */
    @Test
    public void checkRecordsFound() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));

        //количества записей из фразы до фильтрации
        String resultOfSearch1 = app.adminPage.countOfRecords.getText();
        int number = extractNumberFromString(resultOfSearch1);
        app.adminPage.searchBtn.click();
        //количества записей из фразы после фильтрации
        String resultOfSearch2 = app.adminPage.countOfRecords.getText();
        int numberAfterSearch = extractNumberFromString(resultOfSearch2);
        Assert.assertNotEquals(number, numberAfterSearch);

        //проверка: количество выведенных строк в итоговой выборке = числу в строке "(хх) Records Found"
        int numInTable = app.adminPage.countOfRecords.findElements(byXpath("//div[@role='cell']/div[text()='Admin']")).size() - 1;
        Assert.assertEquals(numInTable, numberAfterSearch);
    }
}
