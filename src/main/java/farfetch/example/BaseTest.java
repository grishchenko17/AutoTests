package farfetch.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

abstract public class BaseTest {

    protected WebDriver driver;


    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.farfetch.com/pl/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        BasePage.setDriver(driver);


    }

    @AfterEach
    public void close() {
        driver.close();
        driver.quit();

    }
}
