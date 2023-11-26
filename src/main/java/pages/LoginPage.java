package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

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
        userNameField.click();
        userNameField.setValue(login);
        passwordField.setValue(password);
        loginButton.click();
    }


    public void loginWithValidCredentials(String login, String password) {
        userNameField.setValue(login);
        userNameField.shouldHave(Condition.exactValue(login));
        passwordField.setValue(password);
        passwordField.shouldHave(Condition.exactValue(password));
        loginButton.click();
        loginButton.shouldBe(Condition.disappear);
    }


    /**
     * Откорректированная проверка "Отображение сообщения при вводе неверного логина или пароля"
     * 1. Вводим невалидный логин или пароль
     * 2. Проверяем отображение сообщения с ошибкой "Invalid credentials"
     */
    public void loginWithInvalidCredentials(String login, String password) {
        userNameField.setValue(login);
        passwordField.setValue(password);
        loginButton.click();
        message.shouldBe(visible);
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Username"
     * 1. Вводим валидный пароль при незаполненном логине
     * 2. Проверяем отображение сообщения "Required" под незаполненном поле
     */
    public void loginWithoutEnteringCredentialUsername(String password) {
        passwordField.setValue("admin123");
        loginButton.click();
        messageRequiredName.shouldBe(visible);
        messageRequiredName.shouldHave(Condition.exactText("Required"));
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Password"
     * 1. Вводим валидный логин при незаполненном поле пароля
     * 2. Проверяем отображение сообщения "Required" под незаполненном поле
     */
    public void loginWithoutEnteringCredentialPassword(String login) {
        userNameField.setValue("Admin");
        loginButton.click();
        messageRequiredPassword.shouldBe(visible);
        messageRequiredPassword.shouldHave(Condition.exactText("Required"));
    }
}
