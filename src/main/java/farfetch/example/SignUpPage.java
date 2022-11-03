package farfetch.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignUpPage {

   private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@data-testid='slice-login-sign-up-tab']")
    private WebElement signUpButtonLocator;

    @FindBy(name = "name")
    private WebElement firstName;

    @FindBy(xpath = "//input[@data-testid='slice-login-email-input']")
    private WebElement email;

    @FindBy(xpath = "//input[@data-testid='slice-login-password-input']")
    private WebElement password;

    @FindBy(xpath = "//button[@data-testid='slice-login-sign-up-button']")
    private WebElement submitButton;

    public void openSignUpForm() {
        signUpButtonLocator.click();
    }
    public void fillName(String nameFirst) {
        firstName.sendKeys(nameFirst);

    }
    public void fillEmail(String emailAddress) {
        email.sendKeys(emailAddress);

    }
    public void fillPassword(String passwordField) {
        password.sendKeys(passwordField);

    }
    public void pressSubmit() {
        submitButton.click();

    }


        }





