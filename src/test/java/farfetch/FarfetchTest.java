package farfetch;

import base.example.BaseTest;
import base.example.ElementsForFarfetch;
import org.junit.jupiter.api.Test;


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

