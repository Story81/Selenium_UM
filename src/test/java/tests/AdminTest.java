package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static pages.AdminPage.extractNumberFromString;

public class AdminTest extends BaseTest {


    @Test
    public void adminTabClick() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));
    }

    @Test
    public void checkRecordsFound() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));

        //нахожу количества записей из фразы до фильтрации
        String resultOfSearch1 = app.adminPage.countOfRecords.getText();
        int number = extractNumberFromString(resultOfSearch1);
        app.adminPage.searchBtn.click();
        //нахожу количества записей из фразы после фильтрации
        String resultOfSearch2 = app.adminPage.countOfRecords.getText();
        int numberAfterSearch = extractNumberFromString(resultOfSearch2);

        //сравниваю, что текст (ХХ) Records Found до и после не одинаовый
        app.adminPage.countOfRecords.shouldNotHave(Condition.exactText(resultOfSearch1));

       //тут я пыталась посчитать количество элементов в выборке, но у меня их получается на 1 больше, потому что один клиент имеет username = Admin
        int nu = app.adminPage.countOfRecords.findElements(byXpath("//div[@role='cell']/div[text()='Admin']")).size();


    }


}
