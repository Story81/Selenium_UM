package tests;

import org.testng.annotations.Test;

public class ClaimTest extends BaseTest {

    @Test
    public void openCalendar() {
        loginPage.login("Admin", "admin123");
        claimPage.openClaimPage();
        claimPage.openCalendar();
    }
    @Test
    public void selectDateInFromDate(){
        loginPage.login("Admin", "admin123");
        claimPage.openClaimPage();
        claimPage.openCalendar();
        claimPage.selectFromDate();
    }
    @Test
    public void checkDefaultDate(){
        loginPage.login("Admin", "admin123");
        claimPage.openClaimPage();
        claimPage.openCalendar();
        claimPage.checkMonthAndYear("3","December", "2023");
    }

}
