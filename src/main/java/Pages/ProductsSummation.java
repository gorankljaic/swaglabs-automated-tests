package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsSummation {

    public static WebDriver driver;

    public By sauceLabsBackPack = By.xpath("//div[text()=\"29.99\"]");

    public ProductsSummation(WebDriver passedDriver){
        driver = passedDriver;
    }

    public boolean sauceLabsBackPackPrice(){
        driver.findElement(sauceLabsBackPack).getText();
        return true;
    }

}
