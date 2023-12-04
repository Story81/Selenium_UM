package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.login("Admin", "admin123");
        loginPage.loginButton.shouldBe(Condition.disappear, Duration.ofSeconds(5));
    }

    /**
     * Проверка "Отображение сообщения при вводе неверного логина или пароля"
     */
    @Test
    public void loginWithInvalidCredentials() {
        loginPage.login("Admin0", "admin1230");
        loginPage.message.shouldBe(visible);
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Username"
     */
    @Test
    public void loginWithoutEnteringCredentialUsername() {
        loginPage.login("", "admin123");
        loginPage.messageRequiredName.shouldBe(visible);
        loginPage.messageRequiredName.shouldHave(Condition.exactText("Required"));
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Password"
     */
    @Test
    public void loginWithoutEnteringCredentialPassword() {
        loginPage.login("Admin", "");
        loginPage.messageRequiredPassword.shouldBe(visible);
        loginPage.messageRequiredPassword.shouldHave(Condition.exactText("Required"));
    }
}
