package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage {

    public SelenideElement adminTab = $(byXpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
    public SelenideElement userRoleButton = $(byXpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
    public SelenideElement userRoleDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement userRoleInput = $(byXpath("(//div[@class='oxd-select-text-input'])[1]"));


}
