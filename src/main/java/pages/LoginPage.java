package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement userNameField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));

    public void login () {

        userNameField.setValue("Admin");
        passwordField.setValue("admin123");
        loginButton.click();
        Configuration.holdBrowserOpen = true;

    }

}
