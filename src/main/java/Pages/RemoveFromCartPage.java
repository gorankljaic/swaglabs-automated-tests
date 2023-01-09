package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveFromCartPage {

    public WebDriver driver;
    public By removeSauceLabsBikeLight = By.id("remove-sauce-labs-bike-light");
    public By removeSauceLabsAllTheThingsTShirtRed = By.cssSelector("button[id=\"remove-test.allthethings()-t-shirt-(red)\"]");

    public RemoveFromCartPage (WebDriver driver){
        this.driver = driver;
    }


    public void clickOnRemoveSauceLabsBikeLightButton(){
        driver.findElement(removeSauceLabsBikeLight).click();
    }
    public void clickOnRemoveSauceLabsAllTheThingsTShirtRedButton(){
        driver.findElement(removeSauceLabsAllTheThingsTShirtRed).click();
    }

}
