package farfetch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElementsForFarfetch extends BasePage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//span[text()='Gifts']")
    private WebElement giftsButton;

    @FindBy(xpath = "//a[@aria-label='Jimmy Choo: Bon Bon bucket bag']")
    private WebElement bag;

    @FindBy(xpath = "//button[@aria-label='Add To Bag']")
    private WebElement addToCart;

    @FindBy(xpath = "//a[@aria-label='Go To Bag']")
    private WebElement goToCart;

    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement deleteFromCart;


    public ElementsForFarfetch() {
        driver.get("https://www.farfetch.com/pl/");
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {

        searchField.click();
        searchField.sendKeys("Jimmy Choo", Keys.ENTER);
        giftsButton.click();
        bag.click();
        addToCart.click();


    }

    public void deleteFromCart() {

        searchField.click();
        searchField.sendKeys("Jimmy Choo", Keys.ENTER);
        giftsButton.click();
        bag.click();
        addToCart.click();
        goToCart.click();
        deleteFromCart.click();
}
}