package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    public static WebDriver driver;

    public By addSauceLabsBackpack = By.cssSelector("button[name=\"add-to-cart-sauce-labs-backpack\"]");
    public By addSauceLabsBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    public By addTestAllTheThingsTShirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    public By shoppingCart = By.cssSelector("div[id=\"shopping_cart_container\"]");

    public AddToCartPage(WebDriver passedDriver){
        driver = passedDriver;
    }

    public void clickOnAddSauceLabsBackpack(){
        driver.findElement(addSauceLabsBackpack).click();
    }
    public void clickOnAddSauceLabsBikeLight(){
        driver.findElement(addSauceLabsBikeLight).click();
    }

    public void clickOnAddTestAllTheThingsTShirtRed(){
        driver.findElement(addTestAllTheThingsTShirtRed).click();
    }
    public void clickOnShoppingCart(){
        driver.findElement(shoppingCart).click();
    }



}
