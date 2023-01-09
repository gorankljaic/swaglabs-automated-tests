package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwitterLink {

    public static WebDriver driver;

    public By tweeterLink = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");

    public TwitterLink(WebDriver driver){
        TwitterLink.driver = driver;
    }

    public void clickOnTweeterLink(){
        driver.findElement(tweeterLink).click();
    }

}
