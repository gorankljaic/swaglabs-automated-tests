package AppTests;

import Pages.LogInPage;
import Pages.Purchase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class PurchaseTest extends BaseClass{

     LogInPage logInpage = new LogInPage(driver);
    Purchase purchase = new Purchase(driver);



    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        logInpage.insertUserName("standard_user");
        logInpage.insertPassword("secret_sauce");
        logInpage.clickOnLogInButton();
    }

    @Test
    public void successfulPurchase()  {
        purchase.clickOnSauceLabsBoltTshirtAddToCartButton();
        purchase.clickOnShoppingCartContainer();
        purchase.clickOnCheckoutButton();
        purchase.insertFirstName("Neil");
        purchase.insertLastName("Johnson");
        purchase.insertZipPostalCode("35995");
        purchase.clickOnContinueButton();
        purchase.clickOnFinishButton();
        String actualResult = driver.findElement(By.xpath("//*[text()=\"Checkout: Complete!\"]")).getText();
        String expectedResult = "CHECKOUT: COMPLETE!";
        Assert.assertEquals("Purchase is Not Successful", actualResult, expectedResult);
    }
}
