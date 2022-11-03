package farfetch;

import farfetch.example.BaseTest;
import farfetch.example.HomePage;
import farfetch.example.WishListPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class AddToWishListTest extends BaseTest {


    @Test
    public void addToWishList() {

        WishListPage wishListPage = PageFactory.initElements(driver,WishListPage.class);
        
        wishListPage.fillSearchField("La Mer", Keys.ENTER);
        Assertions.assertEquals("La Mer | FARFETCH", "La Mer | FARFETCH");
        wishListPage.sortBy();
        wishListPage.chooseSorting();
        wishListPage.chooseItem();
        wishListPage.addToWishList();




    }

}
