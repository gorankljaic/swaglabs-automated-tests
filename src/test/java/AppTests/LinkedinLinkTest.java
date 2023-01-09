package AppTests;

import Pages.LinkedinLink;
import Pages.LogInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class LinkedinLinkTest extends BaseClass{

    LogInPage logInPage = new LogInPage(driver);
    LinkedinLink linkedinLink = new LinkedinLink(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.doLogInWithValidCredentials();
    }

    @Test
    public void linkedinLinkTest() throws InterruptedException {
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        linkedinLink.clickOnLinkedinLink();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "Join LinkedIn";
        Assert.assertNotEquals("We are on SwagLabs page", actualResult, expectedResult);
    }
}
