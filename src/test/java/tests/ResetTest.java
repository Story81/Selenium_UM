package tests;

import org.testng.annotations.Test;

public class ResetTest extends BaseTest {

    /**
     * Проверка "Открытие экрана для сброса пароля"
     */
    @Test
    public void ClickOnForgotYourPassword() {
        resetPage.ClickOnForgotYourPassword();
    }

    /**
     * Проверка "Возврат на страницу авторизации со страницы сброса пароля"
     */
    @Test
    public void ReturnToLoginPageFromResetPage() {
        resetPage.ReturnToLoginPageFromResetPage();
    }
}
