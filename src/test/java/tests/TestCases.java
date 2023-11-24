package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestCases {
    WebDriver driver;
    @BeforeTest
    public void auth(){
        LoginTest loginTest = new LoginTest();
        loginTest.loginWithValidCredentials();
        Configuration.holdBrowserOpen = true;


    }

    @Test
    public void openAssignLeave(){
        /*
         * Проверка перехода в раздел "Assign Leave".
         */

        SelenideElement launchAssignLeave = $(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--warn orangehrm-report-icon']"));
        launchAssignLeave.click();

    }

    @Test
    public void editFullName(){
        /*
         * Проверка редактирования ФИО в разделе "My info".
         */

        SelenideElement launchMyInfo = $(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
        SelenideElement firstNameField = $(By.name("firstName"));
        SelenideElement saveButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

        launchMyInfo.click();
        firstNameField.click();
        $(By.name("firstName")).sendKeys(Keys.CONTROL + "a");
        $(By.name("firstName")).sendKeys(Keys.BACK_SPACE);
        firstNameField.setValue("John");
        saveButton.click();

    }

    @Test
    public void ovThirtyChar() throws AWTException {
        /*
         * Проверка строки ФИО на максимальное количество символов в разделе "My info".
         */

        SelenideElement launchMyInfo = $(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
        SelenideElement firstNameField = $(By.name("firstName"));
        SelenideElement saveButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

        launchMyInfo.click();
        firstNameField.click();
        $(By.name("firstName")).sendKeys(Keys.CONTROL + "a");
        $(By.name("firstName")).sendKeys(Keys.BACK_SPACE);
        firstNameField.setValue("ммммммммммммммммммммммммммммммм");
        saveButton.click();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_CONTROL);


    }

    @Test
    public void wrongTimeFormat(){
        /*
         * Проверка строки Project на максимальное количество символов в разделе "Time".
         */

        SelenideElement launchTime = $(By.xpath("//a[@href='/web/index.php/time/viewTimeModule']"));
        SelenideElement clickDropMenu = $(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']"));
        SelenideElement clickMyTimesheets = $(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]"));
        SelenideElement editButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
        SelenideElement project = $(By.xpath("//input[@placeholder='Type for hints...']"));

        launchTime.click();
        clickDropMenu.click();
        clickMyTimesheets.click();
        editButton.click();
        project.click();
        project.setValue("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void wrongDateClaims(){
        /*
         * Проверка строки From Date на ввод не правильного формата данных в разделе "Time".
         */
        SelenideElement launchClaim = $(By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']"));
        SelenideElement fromDate = $(By.xpath("//input[@placeholder='mm-dd-yyyy']"));
        SelenideElement space = $(By.xpath("//div[@class='oxd-form-actions']"));

        launchClaim.click();
        fromDate.click();
        fromDate.setValue("efefe");
        space.click();
    }


}
