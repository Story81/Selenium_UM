package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;

public class HeaderTest extends BaseTest {

    /**
     * Open "Admin" Page
     * Click on the Button "About".
     */

    @Test
    @Description("")
    @Tag("")
    public void userDropdownTabAboutButton() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.headerPage.userDropdownTabButton.click();
        app.headerPage.userDropdown.getWrappedElement().findElement(byText("About")).click();
    }

    /**
     * Open "UserDownMenue"
     * Click on the Button "Support".
     */

    @Test
    @Description("")
    @Tag("")
    public void userDropdownTabSupportButton() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.headerPage.userDropdownTabButton.click();
        app.headerPage.userDropdown.getWrappedElement().findElement(byText("Support")).click();
    }

    /**
     * Click on the Button "Help".
     */

    @Test
    @Description("")
    @Tag("")
    public void helpButton() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.headerPage.helpButton.click();
        app.headerPage.helpButton.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
