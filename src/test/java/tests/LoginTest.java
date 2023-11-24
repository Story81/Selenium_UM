package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LeavePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        loginPage.userNameField.click();
        loginPage.userNameField.setValue("Admin");
        loginPage.userNameField.shouldHave(Condition.exactValue("Admin"));
        loginPage.passwordField.setValue("admin123");
        loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));
        loginPage.loginButton.click();
        loginPage.loginButton.shouldBe(Condition.disappear);
        loginPage.loginButton.shouldNotBe(Condition.visible);
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginPage.userNameField.click();
        loginPage.userNameField.setValue("sjkdksf");
        loginPage.passwordField.setValue("admin123");
        loginPage.loginButton.click();
    }

}
