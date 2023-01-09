package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLink {

    public static WebDriver driver;

    public By linkedinLink = By.cssSelector("a[href=\"https://www.linkedin.com/company/sauce-labs/\"]");

    public LinkedinLink(WebDriver driver){
        LinkedinLink.driver = driver;
    }

    public void clickOnLinkedinLink(){
        driver.findElement(linkedinLink).click();
    }
}
