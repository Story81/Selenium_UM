package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

/**
 * These are frontend elements found by xpass
 */

public class LeavePage extends BasePage {
    public SelenideElement leaveTab = $(byXpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]"));
    public SelenideElement myLeave = $(byXpath("//li[@class='oxd-topbar-body-nav-tab --visited']"));
    public SelenideElement userNameField = $(byName("username"));
    public SelenideElement passwordField = $(byName("password"));
    public SelenideElement loginButton = $(byXpath("//button[@type='submit']"));

}
