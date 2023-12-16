package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MyInfoTest extends BaseTest {

    /**
     * 1. Section "My Info" opens.
     * 2. Firstname is entered.
     * 3. Click on the button "Save.
     */
    @Test
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
     * Проверка скачивания файла
     */
    @Test
    public void downloadFile() throws URISyntaxException {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.itemMemberships.click();
        File file = Selenide.download("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewAttachment/empNumber/7/attachId/2", 5000);
    }

    /**
     * Проверка открытия новой страницы после нажатия на "?".
     */
    @Test
    public void openNextTab() throws InterruptedException {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.iconMyInfo.click();
        app.myInfoPage.itemMemberships.click();
        app.myInfoPage.questionBtn.click();
        Selenide.switchTo().window(1);
        webdriver().shouldHave(url("https://starterhelp.orangehrm.com/hc/en-us"), Duration.ofSeconds(42));
    }
}
