package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.BuzzPage;

public class BuzzTest extends BaseTest{

    /**
     * Section Buzz opens
     */
    @Test
    public void openBuzz(){
        buzzPage.iconBuzz.click();
        buzzPage.headerBuzz.shouldHave(Condition.exactText("Buzz"));

    }

}
