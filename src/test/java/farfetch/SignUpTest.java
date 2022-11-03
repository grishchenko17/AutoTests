package farfetch;

import farfetch.example.BaseTest;
import farfetch.example.HomePage;
import farfetch.example.SignUpPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class SignUpTest extends BaseTest {

    @Test
    public void signUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.findProfile();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.openSignUpForm();
        signUpPage.fillName("Maryia");
        signUpPage.fillEmail("grishchenko.m17@gmail.com");
        signUpPage.fillPassword("PassWord1!");
        signUpPage.pressSubmit();


    }

}
