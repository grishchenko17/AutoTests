package farfetch.example;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CountrySelectorPage {
////    private WebDriver driver;
////    private WebDriverWait wait;
////
////    public CountrySelectorPage(WebDriver driver) {
////        this.driver = driver;
//
//    }
    @FindBy(xpath = "//button[@aria-label='Open country selector.']")
    private WebElement countrySelectorButton;

    @FindBy(name= "Search country")
    private WebElement searchCountry;

    @FindBy(xpath= "//a[@data-testid='countryItem_US']")
    private WebElement newRegion;

    @FindBy(xpath = "//button[@data-tstid='btnClose']")
    private WebElement closeButton;

    @FindBy(xpath = "//button[@data-tstid='country_selector_btn_desktop']")
    private WebElement newRegionButton;

    public void clickCountrySelector() {
        countrySelectorButton.click();
    }
    public void searchCountry(String country) {
        searchCountry.sendKeys(country);
    }
    public void chooseNewRegion() {
        newRegion.click();
    }
    public void closeModal() {
        closeButton.click();
    }


//    public WebElement checkThatRegionIsChanged() {
//        newRegionButton.;
//        return newRegionButton;
//    }


    }

