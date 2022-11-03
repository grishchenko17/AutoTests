package farfetch.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@aria-label='My account']")
    private WebElement myAccButton;

    @FindBy(linkText = "href=/pl/useraccount.aspx")
    private WebElement accountLink;

    @FindBy(xpath = "//p[text()='Welcome to your account, Мария']")
    private WebElement accTitle;


    public void clickToMyAcc() {
        myAccButton.click();

    }
    public void goToMyAccount() {
        accountLink.click();
    }
    public void checkTitleAccount() {
        accTitle.isDisplayed();
    }

}
