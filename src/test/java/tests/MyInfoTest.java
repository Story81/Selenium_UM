package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest{

    /**
     * Enter a FirstName and save the data in the section
     */
    @Test
    public void editFirstName(){
        myInfoPage.iconMyInfo.click();
        myInfoPage.firstName.click();
        myInfoPage.firstName.sendKeys(Keys.CONTROL + "a");
        myInfoPage.firstName.sendKeys(Keys.BACK_SPACE);
        myInfoPage.firstName.setValue("John");
        myInfoPage.firstName.shouldHave(Condition.exactValue("John"));
        myInfoPage.saveButton.click();

    }
}
