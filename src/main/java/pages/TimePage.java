package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TimePage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement iconTime = $(byXpath("//a[@href='/web/index.php/time/viewTimeModule']"));
    public SelenideElement timesheets = $(byXpath("//span[@class='oxd-topbar-body-nav-tab-item']"));
    public SelenideElement dropMenu = $(byXpath("//a[@class='oxd-topbar-body-nav-tab-link'][1]"));
    public SelenideElement editButton = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
    public SelenideElement cellProject =$(byXpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement chooseProject = $(byXpath("//div[@class='oxd-autocomplete-option']"));
    public SelenideElement activitySelect = $(byXpath("//div[@class='oxd-select-text oxd-select-text--active oxd-select-text--error']"));
    public SelenideElement dropMenuActivity = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement selectedActivity =$(byXpath("//div[@class='oxd-select-text-input']"));
    public SelenideElement saveButton = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));

}
