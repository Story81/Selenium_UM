package tests;

import org.testng.annotations.Test;

import java.time.Duration;

public class PIMTest extends BaseTest {

    /**
     * Проверка "открытие страницы "PIM"
     * 1. Авторизоваться на сайте
     * 2. В боковом меню нажать на меню "PIM"
     * 3. На открывшейся странице проверить отображение заголовка PIM
     */
    @Test
    public void openPIMPage() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.pimPage.openPIMPage();
    }

    /**
     * Проверка "Поиск по полю "Employment Status"
     * 1. Авторизоваться.
     * 2. Перейти в раздел PIM
     * 3. Кликнуть на поле "Employment Status"
     * 4. Выбрать в выпадающем списке значение "Full-Time Permanent"
     * 5. Нажать на кнопку Search
     * 6. проверить, что в итоговой таблице в первой строке "Employment Status" значение равно "Full-Time Permanent"
     */
    @Test
    public void searchBySupervisorName() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.pimPage.openPIMPage();
        app.pimPage.searchByEmploymentStatus();
    }

    /**
     * Проверка "Поиск по полю "Sub Unit"
     * 1. Авторизоваться.
     * 2. Перейти в раздел PIM
     * 3. Кликнуть на поле "Sub Unit"
     * 4. Выбрать в выпадающем списке значение "Development"
     * 5. Нажать на кнопку Search
     * 6. Проверить, что в итоговой таблице количество найденных записей равно 4
     */

    @Test
    public void searchBySubUnit() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.pimPage.openPIMPage();
        app.pimPage.searchBySubUnit();
    }

    /**
     * Проверка "Сброс значений полей поиска"
     * 1. Авторизоваться.
     * 2. Перейти в раздел PIM
     * 3. Кликнуть на поле "Sub Unit"
     * 4. Выбрать в выпадающем списке значение "Development"
     * 5. Кликнуть на поле "Employment Status"
     * 6. Выбрать в выпадающем списке значение "Full-Time Permanent"
     * 7. Нажать на кнопку Reset
     * 6. Проверить, что значение полей "Sub Unit" и "Full-Time Permanent" обнулились и имеют значение "Select"
     */
    @Test
    public void resetPIMFields() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.pimPage.openPIMPage();
        app.pimPage.searchOnTwoFields();
        app.pimPage.resetPIMFields();
    }
}
