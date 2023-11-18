package tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    public void loginWithValidCredentials() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        SelenideElement userNameField = $(By.name("username"));
        SelenideElement passwordField = $(By.name("password"));
        SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));

        userNameField.setValue("Admin");
        passwordField.setValue("admin123");
        loginButton.click();
    }

    @Test
    public void loginWithInvalidCredentials() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        SelenideElement userNameField = $(By.name("username"));
        SelenideElement passwordField = $(By.name("password"));
        SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));

        userNameField.setValue("sjkdksf");
        passwordField.setValue("admin123");
        loginButton.click();
    }

}
