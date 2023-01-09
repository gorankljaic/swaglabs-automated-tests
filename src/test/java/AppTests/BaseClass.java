package AppTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass()  {
        driver.quit();
    }

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
    }

}
