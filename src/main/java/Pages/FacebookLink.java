package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLink {

    public static WebDriver driver;

    public By facebookLink = By.cssSelector("a[href=\"https://www.facebook.com/saucelabs\"]");

    public FacebookLink(WebDriver passedDriver){
        driver = passedDriver;
    }

    public void clickOnFacebookLink(){
        driver.findElement(facebookLink).click();
    }

}
