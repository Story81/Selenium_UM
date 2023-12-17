package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {

    /**
     * 1. Section "LeavePage" opens.
     * 2. "My Leave" opens
     */
    @Test
    @Description("")
    @Tag("")
    public void myLeave() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.myLeave.click();
    }
    @Test
    @Description("")
    @Tag("")
    public void leaveTabClick() {
        app.loginPage.login("Admin", "admin123");
        app.leavePage.clickLeave.click();
        app.leavePage.shouldBeLeaveList.shouldBe(Condition.exactText("Leave List"));

    }

    @Test
    @Description("")
    @Tag("")
    public void searchEmployeeName() {
        app.loginPage.login("Admin", "admin123");
        app.leavePage.clickLeave.click();
        app.leavePage.userRoleDropDown.shouldBe(Condition.exactText("-- Select --"));
        app.leavePage.userRoleButton.click();
        app.leavePage.userRoleInput.shouldHave(Condition.exactText("Development"));
    }
}
