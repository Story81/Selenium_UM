package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

/**
 * Creating class objects
 */
public class BaseTest {

    BasePage basePage = new BasePage();
    BuzzPage buzzPage  = new BuzzPage();
    ClaimPage claimPage = new ClaimPage();
    LoginPage loginPage = new LoginPage();
    MyInfoPage myInfoPage = new MyInfoPage();
    TimePage timePage = new TimePage();
    WebDriver driver;


    /**
     * Here the user goes through automation
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
