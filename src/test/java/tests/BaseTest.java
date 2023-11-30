package tests;

import org.openqa.selenium.WebDriver;
import pages.*;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

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



}