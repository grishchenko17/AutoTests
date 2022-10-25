package way2automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsForWay extends BasePage{

    @FindBy(xpath = "//input[@name = 'name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@type = 'radio']")
    private WebElement maritalStatus;

    @FindBy(xpath = "//input[@type = 'checkbox']")
    private WebElement hobby;

    @FindBy(xpath = "//input[@name = 'phone']")
    private WebElement phone;

    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name = 'username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name = 'c_password']")
    private WebElement cPassword;

    @FindBy(xpath = "//input[@type= 'submit']")
    private WebElement button;


    public ElementsForWay() {
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        PageFactory.initElements(driver, this);
    }

        public ElementsForWay createUser() {
        firstName.click();
        firstName.sendKeys("Mary");
        lastName.click();
        lastName.sendKeys("Grishchenko");
        maritalStatus.click();
        hobby.click();
        phone.click();
        phone.sendKeys("23343443");
        email.click();
        email.sendKeys("grishchenko.m17@gmail.com");
        username.click();
        username.sendKeys("masha");
        password.click();
        password.sendKeys("password");
        cPassword.click();
        cPassword.sendKeys("password");
        button.click();
        return this;
    }





}
