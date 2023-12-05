package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement userNameField = $(byName("username"));
    public SelenideElement passwordField = $(byName("password"));
    public SelenideElement loginButton = $(byXpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(byXpath("//div[@role='alert']//p[text()='Invalid credentials']"));
    public SelenideElement messageRequiredName = $(byXpath("//div/input[@name='username']/../following-sibling::span"));
    public SelenideElement messageRequiredPassword = $(byXpath("//div/input[@name='password']/../following-sibling::span"));

    public void login (String login, String password) {
        userNameField.setValue(login);
        userNameField.shouldHave(Condition.exactValue(login));
        passwordField.setValue(password);
        passwordField.shouldHave(Condition.exactValue(password));
        loginButton.click();

    }

}
