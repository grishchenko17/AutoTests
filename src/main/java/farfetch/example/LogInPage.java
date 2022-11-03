package farfetch.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {

    private WebDriver driver;


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@data-test='go-to-login-desktop']")
    private WebElement profileButton;

    @FindBy(xpath = "//input[@data-testid='slice-login-email-input']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@data-testid='slice-login-password-input']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-testid='slice-login-sign-in-button']")
    private WebElement signInButton;

    public void openLogInForm() {
        profileButton.click();
    }
    public void fillEmail(String emailAddress) {
        emailField.sendKeys(emailAddress);
    }
    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void pressSubmit() {
        signInButton.click();
    }
}