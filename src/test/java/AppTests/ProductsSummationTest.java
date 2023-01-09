package AppTests;

import Pages.AddToCartPage;
import Pages.LogInPage;
import Pages.ProductsSummation;
import Pages.Purchase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductsSummationTest extends BaseClass{

    LogInPage logInPage = new LogInPage(driver);
    AddToCartPage addToCartPage = new AddToCartPage(driver);
    Purchase purchase = new Purchase(driver);
    ProductsSummation productsSummation = new ProductsSummation(driver);

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInPage.doLogInWithValidCredentials();
    }

    @Test
    public void SuccessfulPriceSummation() {
        addToCartPage.clickOnAddSauceLabsBackpack();
        addToCartPage.clickOnAddSauceLabsBikeLight();
        addToCartPage.clickOnAddTestAllTheThingsTShirtRed();
        addToCartPage.clickOnShoppingCart();
        purchase.clickOnCheckoutButton();
        purchase.insertFirstName("Neil");
        purchase.insertLastName("Johnson");
        purchase.insertZipPostalCode("35995");
        purchase.clickOnContinueButton();
        System.out.println(productsSummation.getProductPricesFromCart());
        String realResult = driver.findElement(By.xpath("//div[text()=\"29.99\"]")).getText();
        String desiredResult = driver.findElement(By.xpath("//*[text()=\"29.99\"]")).getText();
        Assert.assertEquals("Not the same result", realResult, desiredResult);
    }
}
