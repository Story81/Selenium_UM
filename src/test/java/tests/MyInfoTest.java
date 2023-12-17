package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class MyInfoTest extends BaseTest {

    /**
     * 1. Section "My Info" opens.
     * 2. Firstname is entered.
     * 3. Click on the button "SaveButton".
     */
    @Test
    @Description("")
    @Tag("")
    public void editFirstName() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.firstName.click();
        app.myInfoPage.firstName.sendKeys(Keys.CONTROL + "a");
        app.myInfoPage.firstName.sendKeys(Keys.BACK_SPACE);
        app.myInfoPage.firstName.setValue("John");
        app.myInfoPage.firstName.shouldHave(Condition.exactValue("John"));
        app.myInfoPage.saveButton.click();

    }

    /**
     * 1. Section "My Info" opens.
     * 2. LastName is entered.
     * 3. Click on the button "SaveButton".
     */
    @Test
    @Description("")
    @Tag("")
    public void editLastName() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.lastName.click();
        app.myInfoPage.lastName.sendKeys(Keys.CONTROL + "a");
        app.myInfoPage.lastName.sendKeys(Keys.BACK_SPACE);
        app.myInfoPage.lastName.setValue("Petrovich");
        app.myInfoPage.lastName.shouldHave(Condition.exactValue("Petrovich"));
        app.myInfoPage.saveButton.click();
    }

    /**
     * 1. Section "My Info" opens.
     * 2. MaritalStatus is entered.
     * 3. Click on the button "SaveButton".
     */
    @Test
    @Description("")
    @Tag("")
    public void editMaritalStatus() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.maritalStatusDropdownTab.click();
        app.myInfoPage.maritalStatusDropDown.getWrappedElement().findElement(byText("Single")).click();
        app.myInfoPage.saveButton.click();
    }

    /**
     * 1. Section "My Info" opens.
     * 2. BloodType is entered.
     * 3. Click on the button "SaveButton".
     */
    @Test
    @Description("")
    @Tag("")
    public void editBloodType() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.bloodTypeDropdownTab.click();
        app.myInfoPage.bloodTypeDropDown.getWrappedElement().findElement(byText("A+")).click();
        app.myInfoPage.saveButton2.click();
    }

}
