package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement iconMyInfo = $(byXpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
    public SelenideElement firstName = $(byName("firstName"));
    public SelenideElement lastName = $(byName("lastName"));
    public SelenideElement saveButton = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    public SelenideElement maritalStatusDropdownTab = $(byXpath("(//div[@class='oxd-select-text--after'])[2]"));
    public SelenideElement maritalStatusDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement bloodTypeDropdownTab = $(byXpath("(//div[@class='oxd-select-text--after'])[3]"));
    public SelenideElement bloodTypeDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement saveButton2 = $(byXpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[2]"));


    public SelenideElement itemMemberships = $(byXpath("//a[@href='/web/index.php/pim/viewMemberships/empNumber/7']"));
    public SelenideElement questionBtn = $(byXpath("//i[@class='oxd-icon bi-question-lg']"));
    public SelenideElement d = $(By.xpath("//link[@href='https://starterhelp4.orangehrm.com/hc/en-us']"));
    public SelenideElement openWindow = $(By.xpath("//h1[@class='visib2ility-hidden']"));


}
