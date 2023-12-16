package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BuzzPage {

    /**
     * Frontend elements found by xpass
     */



    public SelenideElement iconBuzz = $(byXpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
    public SelenideElement headerBuzz = $(byXpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
    public SelenideElement mostLikedPosts = $(byXpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']"));

}
