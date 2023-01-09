package AppTests;

import Pages.FacebookLink;
import Pages.LogInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacebookLinkTest extends BaseClass{

    LogInPage logInPage = new LogInPage(driver);
    FacebookLink facebookLink = new FacebookLink(driver);


    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.insertUserName("standard_user");
        logInPage.insertPassword("secret_sauce");
        logInPage.clickOnLogInButton();
    }

    @Test
    public void facebookLinkTest() throws InterruptedException {
        facebookLink.clickOnFacebookLink();
        Thread.sleep(5000);
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "Facebook";
        Assert.assertFalse(actualResult.contains(expectedResult));
    }
}
