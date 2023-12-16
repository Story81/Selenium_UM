package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {


    public SelenideElement userDropdownTabButton = $(byXpath("//span[@class='oxd-userdropdown-tab']"));

    public SelenideElement userDropdown = $(byXpath("//ul[@class='oxd-dropdown-menu']"));
    public SelenideElement helpButton = Selenide.$(By.cssSelector(".bi-question-lg"));


}
