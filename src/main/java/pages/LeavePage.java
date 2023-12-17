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
    public SelenideElement clickLeave = $(byXpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
    public SelenideElement userRoleButton = $(byXpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
    public SelenideElement userRoleDropDown = $(byXpath("//div[@class='oxd-select-text-input']"));
    public SelenideElement userRoleInput = $(byXpath("(//div[@role='option'])[4]"));
    public SelenideElement shouldBeLeaveList = $(byXpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']"));


}
