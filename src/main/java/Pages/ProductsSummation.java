package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class ProductsSummation {

    public static WebDriver driver;

    public By sauceLabsBackPack = By.xpath("//div[text()=\"29.99\"]");

    public ProductsSummation(WebDriver passedDriver) {
        driver = passedDriver;
    }

    public double getProductPricesFromCart() {
        double sum = 0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        for (WebElement cartElementPrice : this.getAllProductsInCart()) {
            try {
                sum = sum + numberFormat.parse(cartElementPrice.getText()).doubleValue();
            } catch (ParseException ignored) {
            }
        }
        return sum;
    }

    public List<WebElement> getAllProductsInCart() {
        return driver.findElements(By.cssSelector(".inventory_item_price"));
    }

    public String parseOnlyCurrency() {
        String test = "Item total: $66";
        int index = test.indexOf("$");
        return test.substring(index);
    }

}
