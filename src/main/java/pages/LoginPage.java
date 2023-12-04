package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement userNameField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $("//div[@role='alert']//p[text()='Invalid credentials']");
    public SelenideElement messageRequiredName = $("//div/input[@name='username']/../following-sibling::span");
    public SelenideElement messageRequiredPassword = $("//div/input[@name='password']/../following-sibling::span");

    public void login (String login, String password) {
        userNameField.setValue(login);
        userNameField.shouldHave(Condition.exactValue(login));
        passwordField.setValue(password);
        passwordField.shouldHave(Condition.exactValue(password));
        loginButton.click();

    }

}
