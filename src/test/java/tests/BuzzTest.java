package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class BuzzTest extends BaseTest{

    /**
     * Section "Buzz" opens.
     */
    @Test
    public void openBuzz(){
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.buzzPage.iconBuzz.click();
        app.buzzPage.headerBuzz.shouldHave(Condition.exactText("Buzz"));
    }
}
