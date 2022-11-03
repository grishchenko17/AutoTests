package farfetch;

import farfetch.example.BaseTest;
import farfetch.example.CountrySelectorPage;
import farfetch.example.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ChangeRegionTest extends BaseTest {

    @Test
    @DisplayName("Change Region")
    public void changeRegion(){
        CountrySelectorPage c = new CountrySelectorPage();

        CountrySelectorPage countrySelectorPage = PageFactory.initElements(driver,CountrySelectorPage.class);
        countrySelectorPage.clickCountrySelector();
        countrySelectorPage.searchCountry("United");
        countrySelectorPage.chooseNewRegion();
        countrySelectorPage.closeModal();

    }
}
