package farfetch.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//label[@data-testid='sortDropdownLabel']")
    private WebElement sortButton;

    @FindBy(xpath = "//a[@href='?page=1&view=90&sort=4&scale=274&q=La%20Mer']")
    private WebElement lowToHighButton;

    @FindBy(xpath = "//p[text()='The Moisturizing Soft Cream']")
    private WebElement item;

    @FindBy(xpath = "//button[@data-component='WishlistIconsContainer']")
    private WebElement addToWishListButton;

    @FindBy(xpath = "//a[@aria-label='Wishlist 1 item.']")
    private WebElement checkWishListButton;

    @FindBy(xpath = "//button[@data-component='ModalCloseButton']")
    private WebElement closeModal;

    @FindBy(xpath = "//button[@aria-label='Close Dialog']")
    private WebElement closeFirstModal;

    public void fillSearchField(String searchValue, Keys enter) {
        searchField.sendKeys(searchValue, Keys.ENTER);
    }

    public void sortBy() {
        sortButton.click();
    }
    public void chooseSorting() {
        lowToHighButton.click();
    }

    public void chooseItem() {
        item.findElement(By.xpath("//p[text()='The Body Crème moisturiser']"));
        item.click();
    }

    public void addToWishList() {
        addToWishListButton.click();
    }


    public void checkWishList() {
        checkWishListButton.findElement(By.xpath("//a[@aria-label='Wishlist 1 item.']"));
    }

//    public void closeModalWindow() {
//        closeModal.click();
//    }

//    public void closeFirstModalWindow() {
//        closeModal.click();


    }
