package tests;

import org.testng.annotations.Test;

public class ResetTest extends BaseTest {

    /**
     * Проверка "Открытие экрана для сброса пароля"
     */
    @Test
    public void ClickOnForgotYourPassword() {
        app.resetPage.ClickOnForgotYourPassword();
    }

    /**
     * Проверка "Возврат на страницу авторизации со страницы сброса пароля"
     */
    @Test
    public void ReturnToLoginPageFromResetPage() {
        app.resetPage.ReturnToLoginPageFromResetPage();
    }
}
