package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;


import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    /**
     * Create class objects
     */
    AdminPage adminPage = new AdminPage();
    BasePage basePage = new BasePage();
    BuzzPage buzzPage  = new BuzzPage();
    ClaimPage claimPage = new ClaimPage();
    LoginPage loginPage = new LoginPage();
    MyInfoPage myInfoPage = new MyInfoPage();
    TimePage timePage = new TimePage();
    WebDriver driver;


    /**
     * Authentication for all methods is specified here
     */
    @BeforeTest
    public void login () {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.userNameField.setValue("Admin");
        loginPage.passwordField.setValue("admin123");
        loginPage.loginButton.click();
        Configuration.holdBrowserOpen = true;
    }



}