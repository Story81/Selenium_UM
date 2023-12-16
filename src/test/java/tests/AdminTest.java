package tests;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static pages.AdminPage.extractNumberFromString;

public class AdminTest extends BaseTest {


    @Test
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
    public void addButtonClick() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.addButton.click();
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
