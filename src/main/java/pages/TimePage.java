package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class TimePage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement iconTime = $(byXpath("//a[@href='/web/index.php/time/viewTimeModule']"));
    public SelenideElement timesheets = $(byXpath("//span[@class='oxd-topbar-body-nav-tab-item']"));
    public SelenideElement dropMenu = $(byXpath("//a[@class='oxd-topbar-body-nav-tab-link'][1]"));
    public SelenideElement editButton = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
    public SelenideElement cellProject = $(byXpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement chooseProject = $(byXpath("//div[@class='oxd-autocomplete-option']"));
    public SelenideElement activitySelect = $(byXpath("//div[@class='oxd-select-text oxd-select-text--active']"));
    public SelenideElement dropMenuActivity = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement selectedActivity = $(byXpath("//div[@class='oxd-select-text-input']"));
    public SelenideElement saveButton = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public SelenideElement clickTime = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]"));
    public SelenideElement haveTextSelect = $(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']"));
    public SelenideElement searchByName = $(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
    public SelenideElement viewButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement haveTextType = $(By.xpath("//input[@placeholder='Type for hints...']"));
}
