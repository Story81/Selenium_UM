package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PIMPage extends BasePage {

    public SelenideElement userNameField = $(byXpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
    public SelenideElement titlePagePIM = $(byXpath("//h6[text()='PIM']"));
    public SelenideElement employmentStatusField = $(byXpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
    public SelenideElement employmentStatusDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement employmentStatusInput = $(byXpath("(//div[@class='oxd-select-text-input'])[1]"));
    public SelenideElement searchBtn = $(byXpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    public SelenideElement employmentStatusInTable = $(byXpath("(//div[@class = 'oxd-table-cell oxd-padding-cell'])[6]"));
    public SelenideElement searchBySubUnitField = $(byXpath("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"));
    public SelenideElement searchBySubUnitDropDown = $(byXpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement subUnitInput = $(byXpath("(//div[@class='oxd-select-text-input'])[4]"));
    public SelenideElement numberOfRecords = $(byXpath("(//span[@class='oxd-text oxd-text--span'])[1]"));
    public SelenideElement resetBtn = $(byXpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--ghost']"));
    public SelenideElement list1 = $(byXpath("//span[text()='Full-Time Permanent']"));
    public SelenideElement list2 = $(byXpath("//span[text()='Development']"));


    public void openPIMPage() {
        userNameField.click();
        titlePagePIM.shouldHave(Condition.exactText("PIM"));
    }


    /**
     * Проверка "Поиск по полю "Employment Status"
     * 1. Кликнуть на поле "Employment Status"
     * 2. Выбрать в выпадающем списке значение "Full-Time Permanent"
     * 3. Нажать на кнопку Search
     * 4. проверить, что в итоговой таблице в первой строке "Employment Status" значение равно "Full-Time Permanent"
     */


    public void searchByEmploymentStatus() {
        employmentStatusField.click();
        list1.shouldBe(Condition.visible, Duration.ofSeconds(5));
        employmentStatusDropDown.getWrappedElement().findElement(byText("Full-Time Permanent")).click();
        employmentStatusInput.shouldHave(Condition.exactText("Full-Time Permanent"));
        searchBtn.click();
        employmentStatusInTable.shouldHave(Condition.exactText("Full-Time Permanent"));
    }

    public void searchBySubUnit() {
        searchBySubUnitField.click();
        list2.shouldBe(Condition.visible, Duration.ofSeconds(5));
        searchBySubUnitDropDown.getWrappedElement().findElement(byText("Development")).click();
        subUnitInput.shouldHave(Condition.exactText("Development"));
        searchBtn.click();
        numberOfRecords.shouldHave(Condition.exactText("(4) Records Found"));
    }

    public void resetPIMFields() {
        searchBySubUnitField.click();

        list2.shouldBe(Condition.visible, Duration.ofSeconds(5));

        searchBySubUnitDropDown.getWrappedElement().findElement(byText("Development")).click();
        subUnitInput.shouldHave(Condition.exactText("Development"));

        employmentStatusField.click();

        list1.shouldBe(Condition.visible, Duration.ofSeconds(5));
        employmentStatusDropDown.getWrappedElement().findElement(byText("Full-Time Permanent")).click();
        employmentStatusInTable.shouldHave(Condition.exactText("Full-Time Permanent"));

        resetBtn.click();
        subUnitInput.shouldHave(Condition.exactText("-- Select --"));
        employmentStatusInput.shouldHave(Condition.exactText("-- Select --"));

    }


}
