package tests;

import org.testng.annotations.Test;

public class PIMTest extends BaseTest {

    /**
     * Проверка "открытие страницы "PIM"
     * 1. Авторизоваться на сайте
     * 2. В боковом меню нажать на меню "PIM"
     * 3. На открывшейся странице проверить отображение заголовка PIM
     */
    @Test
    public void openPIMPage() {
        loginPage.login("Admin", "admin123");
        pimPage.openPIMPage();
    }

    @Test
    public void searchBySupervisorName() {
        loginPage.login("Admin", "admin123");
        pimPage.openPIMPage();
        pimPage.searchByEmploymentStatus();
    }
}
