package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {
    public SelenideElement userNameField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement message = $x("//div[@role='alert']//p[text()='Invalid credentials']");
    public SelenideElement messageRequiredName = $x("//div/input[@name='username']/../following-sibling::span");
    public SelenideElement messageRequiredPassword = $x("//div/input[@name='password']/../following-sibling::span");

    public void login(String login, String password) {
        userNameField.setValue(login);
        userNameField.shouldHave(Condition.exactValue(login),Duration.ofSeconds(5));
        passwordField.setValue(password);
        passwordField.shouldHave(Condition.exactValue(password),Duration.ofSeconds(5));
        loginButton.click();
    }
}
