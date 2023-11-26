package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    LeavePage leavePage = new LeavePage();
    AdminPage adminPage = new AdminPage();
    ResetPage resetPage = new ResetPage();
    PIMPage pimPage = new PIMPage();

    @BeforeTest
    public void setup () {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown() {
    }

}
