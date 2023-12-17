package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest extends BaseTest {

    /**
     * Авторизация с верным логином и паролем
     */
    @Test
    public void loginWithValidCredentials() {
        app.loginPage.login("Admin", "admin123");
        app.loginPage.loginButton.shouldBe(Condition.disappear, Duration.ofSeconds(5));
    }

    /**
     * Проверка "Отображение сообщения при вводе неверного логина или пароля"
     */
    @Test
    public void loginWithInvalidCredentials() {
        app.loginPage.login("Admin0", "admin1230");
        app.loginPage.errorMessage.shouldBe(Condition.visible);
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Username"
     */
    @Test
    public void loginWithoutEnteringCredentialUsername() {
        app.loginPage.login("", "admin123");
        app.loginPage.messageRequiredName.shouldBe(Condition.visible);
        app.loginPage.messageRequiredName.shouldHave(Condition.exactText("Required"));
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Password"
     */
    @Test
    public void loginWithoutEnteringCredentialPassword() {
        app.loginPage.login("Admin", "");
        app.loginPage.messageRequiredPassword.shouldBe(Condition.visible);
        app.loginPage.messageRequiredPassword.shouldHave(Condition.exactText("Required"));
    }
    @Test
    public void loginInvalidCredentials() {
        app.loginPage.userNameField.click();
        app.loginPage.userNameField.setValue("sjkdksf");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();
        app.loginPage.login("Addmin", "admin123");
        sleep(3000);
        app.loginPage.invalidCredentional.getWrappedElement().findElement(byText("Invalid credentials"));

    }
}
