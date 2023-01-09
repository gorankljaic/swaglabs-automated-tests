package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase {

    public WebDriver driver;

    public By sauceLabsBoltTshirtAddToCartButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public By shoppingCartContainer = By.id("shopping_cart_container");
    public By checkoutButton = By.cssSelector("button[name=\"checkout\"]");
    public By inputFieldFirstName = By.cssSelector("input[name=\"firstName\"]");
    public By inputFieldLastName = By.id("last-name");
    public By inputFieldZipPostalCode = By.cssSelector("input[placeholder=\"Zip/Postal Code\"]");
    public By continueButton = By.id("continue");
    public By finishButton = By.xpath("//*[@id=\"finish\"]");

    public Purchase(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnSauceLabsBoltTshirtAddToCartButton(){
        driver.findElement(sauceLabsBoltTshirtAddToCartButton).click();
    }
    public void clickOnShoppingCartContainer(){
        driver.findElement(shoppingCartContainer).click();
    }
    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void insertFirstName(String typeFirstNameText){
        driver.findElement(inputFieldFirstName).sendKeys(typeFirstNameText);
    }
    public void  insertLastName(String typeLastNameText){
        driver.findElement(inputFieldLastName).sendKeys(typeLastNameText);
    }
    public void insertZipPostalCode(String typeTextOfZipPostalCode){
        driver.findElement(inputFieldZipPostalCode).sendKeys(typeTextOfZipPostalCode);
    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void clickOnFinishButton(){
        driver.findElement(finishButton).click();
    }






}
