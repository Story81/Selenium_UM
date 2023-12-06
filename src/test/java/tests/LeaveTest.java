package tests;

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
}
