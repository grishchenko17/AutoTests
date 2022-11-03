package farfetch.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//a[@title='FARFETCH homepage.']")
    private WebElement mainPage;

    @FindBy(xpath = "//section[@data-testid='gdpr-callout-notification-desktop']")
    private WebElement modalCookies;

    @FindBy(xpath = "//button[@data-testid='Button_PrivacySettingsBanner_AcceptAll']")
    private WebElement acceptButton;

    private By profileButton = By.xpath("//button[@aria-label='Login page.']");
    public void open() {
        driver.get("https://www.farfetch.com/pl/");
    }
    public void findProfile() {
        mainPage.findElement(profileButton).click();

    }
    public void closeCookie() {
        modalCookies.findElement(By.xpath("//section[@data-testid='gdpr-callout-notification-desktop']"));
        acceptButton.click();



    }



}

