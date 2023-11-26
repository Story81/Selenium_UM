package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PIMPage extends BasePage {
    //    LoginPage loginPage = new LoginPage();
    public SelenideElement userNameField = $x("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");
    public SelenideElement titlePagePIM = $x("//h6[text()='PIM']");
    public SelenideElement employmentStatusField = $(byXpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
    public SelenideElement employmentStatusDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
     public SelenideElement employmentStatusInput = $(byXpath("(//div[@class='oxd-select-text-input'])[1]"));


    public void openPIMPage() {
        userNameField.click();
        titlePagePIM.shouldHave(Condition.exactText("PIM"));
    }


    public void searchByEmploymentStatus() {
        employmentStatusField.click();
        employmentStatusDropDown.getWrappedElement().findElement(byText("Full-Time Permanent")).click();

    }

}
