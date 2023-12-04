package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        app.loginPage.userNameField.click();
        app.loginPage.userNameField.setValue("Admin");
        app.loginPage.userNameField.shouldHave(Condition.exactValue("Admin"));
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));
        app.loginPage.loginButton.click();
        app.loginPage.loginButton.shouldBe(Condition.disappear);
        app.loginPage.loginButton.shouldNotBe(Condition.visible);
    }

    @Test
    public void loginWithInvalidCredentials() {
        app.loginPage.userNameField.click();
        app.loginPage.userNameField.setValue("sjkdksf");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();
    }

}
