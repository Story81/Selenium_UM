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

    @BeforeTest
    public void auth(){
        LoginTest loginTest = new LoginTest();
        loginTest.loginWithValidCredentials();
        Configuration.holdBrowserOpen = true;


    }

    @Test
    public void openBuzz(){
        /*
         * Проверка перехода в раздел "Buzz".
         */

        $(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")).click();


    }

    @Test
    public void editFullName(){
        /*
         * Проверка редактирования ФИО в разделе "My info".
         */

        $(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
        $(By.name("firstName")).click();
        $(By.name("firstName")).sendKeys(Keys.CONTROL + "a");
        $(By.name("firstName")).sendKeys(Keys.BACK_SPACE);
        $(By.name("firstName")).setValue("John");
        $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();



    }

    @Test
    public void ovThirtyChar() throws AWTException {
        /*
         * Проверка строки ФИО на максимальное количество символов в разделе "My info".
         */

        $(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
        $(By.name("firstName")).click();
        $(By.name("firstName")).sendKeys(Keys.CONTROL + "a");
        $(By.name("firstName")).sendKeys(Keys.BACK_SPACE);
        $(By.name("firstName")).setValue("ммммммммммммммммммммммммммммммм");
        $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();


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

        $(By.xpath("//a[@href='/web/index.php/time/viewTimeModule']")).click();
        $(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
        $(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]")).click();
        $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
        $(By.xpath("//input[@placeholder='Type for hints...']")).click();
        $(By.xpath("//input[@placeholder='Type for hints...']")).setValue("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");


    }

    @Test
    public void wrongDateClaims(){
        /*
         * Проверка строки From Date на ввод не правильного формата данных в разделе "Claim".
         */
        $(By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']")).click();
        $(By.xpath("//input[@placeholder='dd-mm-yyyy']")).click();
        $(By.xpath("//input[@placeholder='dd-mm-yyyy']")).setValue("efefe");
        $(By.xpath("//div[@class='oxd-form-actions']")).click();


    }


}
