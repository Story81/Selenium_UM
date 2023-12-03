package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest {


    @Test
    public void adminUserClick(){
        adminPage.userNameField.setValue("Admin");
        adminPage.userNameField.shouldHave(Condition.exactValue("Admin"));
    }

}
