package way2automation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import way.example.BaseTest;
import way.example.ElementsForWay;

public class ErrorEmailTest extends BaseTest {

    @Test
    public void errorMessageIsShown() {


        ElementsForWay e = new ElementsForWay();
        WebElement errorMessage = e.showErrorMessageInEmail();
        Assertions.assertEquals("Please enter a valid email address.", errorMessage.getText());

    }

}
