package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.login("Admin", "admin123");
    }

    /**
     * Проверка "Отображение сообщения при вводе неверного логина или пароля"
     */
    @Test
    public void loginWithInvalidCredentials() {
        loginPage.login("Admin0", "admin1230");
        loginPage.loginWithInvalidCredentials();
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Username"
     */
    @Test
    public void loginWithoutEnteringCredentialUsername() {
        loginPage.loginWithoutEnteringCredentialUsername("admin123");
    }

    /**
     * Проверка "Нажатие кнопки Login при незаполненном поле "Password"
     */
    @Test
    public void loginWithoutEnteringCredentialPassword() {
        loginPage.loginWithoutEnteringCredentialPassword("Admin");
    }
}
