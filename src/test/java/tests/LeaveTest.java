package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {

    /**
     * 1. Section "LeavePage" opens.
     * 2. "My Leave" opens
     */
    @Test
    public void myLeave() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.myLeave.click();
    }
    @Test
    public void leaveTabClick() {
        app.loginPage.login("Admin", "admin123");
        app.leavePage.clickLeave.click();
        app.leavePage.shouldBeLeaveList.shouldBe(Condition.exactText("Leave List"));

    }

    @Test
    public void searchEmployeeName() {
        app.loginPage.login("Admin", "admin123");
        app.leavePage.clickLeave.click();
        app.leavePage.userRoleDropDown.shouldBe(Condition.exactText("-- Select --"));
        app.leavePage.userRoleButton.click();
        app.leavePage.userRoleInput.shouldHave(Condition.exactText("Development"));
    }
}
