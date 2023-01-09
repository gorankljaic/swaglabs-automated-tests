package AppTests;

import Pages.AddToCartPage;
import Pages.LogInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddToCartTest extends BaseClass {

    LogInPage logInPage = new LogInPage(driver);
    AddToCartPage addToCartPage = new AddToCartPage(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.doLogInWithValidCredentials();
    }

    @Test
    public void successfulAddToCart() {
        addToCartPage.clickOnAddSauceLabsBackpack();
        addToCartPage.clickOnAddSauceLabsBikeLight();
        addToCartPage.clickOnAddTestAllTheThingsTShirtRed();
        addToCartPage.clickOnShoppingCart();
        String inCart1 = driver.findElement(By.cssSelector("div[id=\"cart_contents_container\"]")).getText();
        String SauceLabsBackpack = driver.findElement(By.xpath("//a/div[text()=\"Sauce Labs Backpack\"]")).getText();
        Assert.assertTrue("Item #1 Is Not In Cart",inCart1.contains(SauceLabsBackpack));
        String inCart2 = driver.findElement(By.cssSelector("div[id=\"cart_contents_container\"]")).getText();
        String SauceLabsBikeLight = driver.findElement(By.xpath("//a/div[text()=\"Sauce Labs Bike Light\"]")).getText();
        Assert.assertTrue("Item #2 Is Not In The Cart",inCart2.contains(SauceLabsBikeLight));
        String inCart3 = driver.findElement(By.cssSelector("div[id=\"cart_contents_container\"]")).getText();
        String TestAllTheThingsTShirtRed = driver.findElement(By.xpath("//a/div[text()=\"Test.allTheThings() T-Shirt (Red)\"]")).getText();
        Assert.assertTrue("Item #3 Is Not In The Cart",inCart3.contains(TestAllTheThingsTShirtRed));
    }
}
