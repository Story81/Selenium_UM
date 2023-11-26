package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LeavePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    LeavePage leavePage = new LeavePage();
    AdminPage adminPage = new AdminPage();

    @BeforeTest
    public void setup () {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown() {

    }

}
