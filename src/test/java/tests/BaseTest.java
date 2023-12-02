package tests;

import com.codeborne.selenide.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static com.codeborne.selenide.Selectors.byXpath;
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

    @BeforeTest
    public void setup(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown() {

    }


}