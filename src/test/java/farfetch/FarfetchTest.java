package farfetch;

import farfetch.example.BaseTest;
import farfetch.example.ElementsForFarfetch;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class FarfetchTest extends BaseTest {

        @Test
        public void addToCart() {
            ElementsForFarfetch tests = new ElementsForFarfetch();
            tests.addToCart();



        }

        @Test
        public void deleteFromCart() {
            ElementsForFarfetch tests = new ElementsForFarfetch();
            tests.deleteFromCart();
        }




    }

