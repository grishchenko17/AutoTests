package farfetch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

abstract public class BaseTest {

    protected WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.farfetch.com/pl/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        BasePage.setDriver(driver);


    }

    @After
    public void close() {
        driver.close();
        driver.quit();

    }
}
