package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClaimPage {

    /**
     * These are frontend elements found by xpass
     */
    public SelenideElement iconClaim = $(byXpath("//a[@href='/web/index.php/claim/viewClaimModule']"));
    public SelenideElement fromDate = $(byXpath("//input[@class='oxd-input oxd-input--active']"));
    public SelenideElement space = $(byXpath("//div[@class='oxd-form-actions']"));
    public SelenideElement errorMessage =$(byXpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));

}
