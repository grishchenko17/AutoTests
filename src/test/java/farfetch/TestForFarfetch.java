package farfetch;

import org.junit.Test;


public class TestForFarfetch extends BaseTest{

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

