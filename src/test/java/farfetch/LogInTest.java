package farfetch;

import farfetch.example.AccountPage;
import farfetch.example.BaseTest;
import farfetch.example.HomePage;
import farfetch.example.LogInPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class LogInTest extends BaseTest {

    @Test
    public void logIn() {

        LogInPage logInPage = PageFactory.initElements(driver,LogInPage.class);
        logInPage.openLogInForm();
        logInPage.fillEmail("grishchenko.m17@gmail.com");
        logInPage.fillPassword("PassWord01!");
        logInPage.pressSubmit();
    }

    @Test
    public void checkAccount() {

        LogInPage logInPage = PageFactory.initElements(driver,LogInPage.class);
        logInPage.openLogInForm();
        logInPage.fillEmail("grishchenko.m17@gmail.com");
        logInPage.fillPassword("PassWord01!");
        logInPage.pressSubmit();

        AccountPage accountPage = PageFactory.initElements(driver,AccountPage.class);
        accountPage.clickToMyAcc();
        accountPage.goToMyAccount();
        accountPage.checkTitleAccount();

    }
}
