package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.eclipse.sisu.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BuzzPage {

    /**
     * These are frontend elements found by xpass
     */

    public SelenideElement iconBuzz = $(byXpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
    public SelenideElement headerBuzz = $(byXpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
}
