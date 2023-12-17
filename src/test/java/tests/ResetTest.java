package tests;

import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class ResetTest extends BaseTest {

    /**
     * Проверка "Открытие экрана для сброса пароля"
     */
    @Test
    @Description("")
    @Tag("")
    public void ClickOnForgotYourPassword() {
        app.resetPage.ClickOnForgotYourPassword();
    }

    /**
     * Проверка "Возврат на страницу авторизации со страницы сброса пароля"
     */
    @Test
    @Description("")
    @Tag("")
    public void ReturnToLoginPageFromResetPage() {
        app.resetPage.ReturnToLoginPageFromResetPage();
    }
}
