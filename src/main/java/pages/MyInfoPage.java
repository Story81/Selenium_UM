package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement iconMyInfo = $(byXpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
    public SelenideElement firstName = $(By.name("firstName"));
    public SelenideElement saveButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public SelenideElement itemMemberships = $(byXpath("//a[@href='/web/index.php/pim/viewMemberships/empNumber/7']"));
    public SelenideElement questionBtn = $(byXpath("//i[@class='oxd-icon bi-question-lg']"));
    public SelenideElement d = $(By.xpath("//link[@href='https://starterhelp4.orangehrm.com/hc/en-us']"));
    public SelenideElement openWindow = $(By.xpath("//h1[@class='visib2ility-hidden']"));


}
