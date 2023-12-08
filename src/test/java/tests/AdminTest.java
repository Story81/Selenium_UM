package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

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



}
