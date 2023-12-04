package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ResetPage extends BasePage {
    LoginPage loginPage = new LoginPage();
    public SelenideElement forgotPasswordBtn = $(By.xpath("//p[text()='Forgot your password? ']"));
    public SelenideElement pageResetPassword = $x("//h6[text()='Reset Password']");
   public SelenideElement cancelBtn = $x("//button[contains(@class, 'forgot-password-button--cancel')]");


    /**
     * Проверка "Открытие экрана для сброса пароля"
     * 1. На странице авторизации нажать на 'Forgot your password?' (Происходит переход на страницу сброса пароля)
     * 2. Проверяем, что 'Forgot your password?' не отображается
     * 3. Проверяем, что на странице отображается кнопка "Reset Password"
     */

    public void ClickOnForgotYourPassword() {
        forgotPasswordBtn.click();
        loginPage.loginButton.shouldBe(Condition.disappear);
        pageResetPassword.shouldBe(visible);
        pageResetPassword.shouldHave(Condition.exactText(" Reset Password "));
    }

    /**
     * Проверка "Возврат на страницу авторизации со страницы сброса пароля"
     * 1. На странице авторизации нажать на 'Forgot your password?' (Происходит переход на страницу сброса пароля)
     * 2. Проверяем, что на странице отображается кнопка "Reset Password"
     * 3. Кликнуть на кнопку 'Cancel' (Происходит переход на страницу авторизации)
     * 4. Проверяем, что отображается кнопка 'Login'
     *
     */

    public void ReturnToLoginPageFromResetPage() {
        forgotPasswordBtn.click();
        pageResetPassword.shouldBe(visible);
        cancelBtn.click();
        loginPage.loginButton.shouldBe(visible);
    }
}
