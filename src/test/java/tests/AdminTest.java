package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest {


    @Test
    public void adminTabClick(){
        adminPage.adminTab.click();
        adminPage.userRoleButton.click();
        adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        adminPage.userRoleInput.shouldHave(Condition.exactText("Admin"));
    }

}
