package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class BuzzTest extends BaseTest {

    /**
     * Section "Buzz" opens.
     */
    @Test
    @Description("")
    @Tag("")
    public void openBuzz() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.buzzPage.iconBuzz.click();
        app.buzzPage.headerBuzz.shouldHave(Condition.exactText("Buzz"));
    }

    /**
     * Section "Buzz" opens
     * MostLikedPosts opens.
     */
    @Test
    @Description("")
    @Tag("")
    public void openMostLikedPosts() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.buzzPage.iconBuzz.click();
        app.buzzPage.mostLikedPosts.click();
    }

}
