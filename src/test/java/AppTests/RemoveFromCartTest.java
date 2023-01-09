package AppTests;

import Pages.AddToCartPage;
import Pages.LogInPage;
import Pages.RemoveFromCartPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RemoveFromCartTest extends BaseClass{

    LogInPage logInPage = new LogInPage(driver);
    AddToCartPage addToCartPage = new AddToCartPage(driver);
    RemoveFromCartPage removeFromCartPage = new RemoveFromCartPage(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.doLogInWithValidCredentials();
    }

    @Test
    public void SuccessfulRemovingItemsFromCartTest() throws InterruptedException {
        addToCartPage.clickOnAddSauceLabsBackpack();
        addToCartPage.clickOnAddSauceLabsBikeLight();
        addToCartPage.clickOnAddTestAllTheThingsTShirtRed();
        addToCartPage.clickOnShoppingCart();
        Thread.sleep(2000);
        removeFromCartPage.clickOnRemoveSauceLabsBikeLightButton();
        removeFromCartPage.clickOnRemoveSauceLabsAllTheThingsTShirtRedButton();
        String realResult = driver.findElement(By.id("cart_contents_container")).getText();
        String expectedResult = "Sauce Labs Bike Light";
        Assert.assertNotEquals("Bike Light Is On The List", realResult, expectedResult);
        String realResult1 = driver.findElement(By.id("cart_contents_container")).getText();
        String expectedResult1 = "Test.allTheThings() T-Shirt (Red)";
        Assert.assertFalse("T-Shirt (Red) Is On The List",realResult1.contains(expectedResult1));
    }
}
