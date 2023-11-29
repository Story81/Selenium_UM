package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class MyInfoTest extends BaseTest{

    /**
     * 1. Section "My Info" opens.
     * 2. Firstname is entered.
     * 3. Click on the button "Save.
     */
    @Test
    public void editFirstName(){
        loginPage.login();
        myInfoPage.iconMyInfo.click();
        myInfoPage.firstName.click();
        myInfoPage.firstName.sendKeys(Keys.CONTROL + "a");
        myInfoPage.firstName.sendKeys(Keys.BACK_SPACE);
        myInfoPage.firstName.setValue("John");
        myInfoPage.firstName.shouldHave(Condition.exactValue("John"));
        myInfoPage.saveButton.click();

    }

}
