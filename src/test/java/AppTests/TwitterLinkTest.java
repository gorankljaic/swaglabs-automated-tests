package AppTests;

import Pages.LogInPage;
import Pages.TwitterLink;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class TwitterLinkTest extends BaseClass {

    LogInPage logInPage = new LogInPage(driver);

    TwitterLink twitterLink = new TwitterLink(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.doLogInWithValidCredentials();
    }

    @Test
    public void tweeterLinkTest() throws InterruptedException {
        js.executeScript("window.scrollBy(0,2000)");
        twitterLink.clickOnTweeterLink();
        String parent = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equalsIgnoreCase(parent)) {
                driver.switchTo().window(handle);
                System.out.println("New Tab Window Title:" + driver.getTitle());
            }
        }
        Thread.sleep(5000);
        Assert.assertTrue("We are not on twitter page",driver.getCurrentUrl().contains("twitter"));
    }
}
