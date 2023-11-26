package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.login("Admin", "admin123");
    }

    @Test
    public void loginWithValidCredentials() {
        loginPage.loginWithValidCredentials("Admin", "admin123");
    }

    /**
     * Откорректированная проверка "Отображение сообщения при вводе неверного логина или пароля"
     */
    @Test
    public void loginWithInvalidCredentials() {
        loginPage.loginWithInvalidCredentials("Admin1", "admin1");
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
