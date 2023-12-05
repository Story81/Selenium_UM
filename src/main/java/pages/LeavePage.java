package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LeavePage extends BasePage {

    public SelenideElement userNameField = $(byName("username"));
    public SelenideElement passwordField = $(byName("password"));
    public SelenideElement loginButton = $(byXpath("//button[@type='submit']"));

}
