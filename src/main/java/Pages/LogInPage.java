package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;

    public By userName = By.id("user-name");
    public By password = By.cssSelector("input[type=\"password\"]");
    public By logInButton = By.id("login-button");
    public By errorMessage = By.xpath("//*[text()=\"Epic sadface: Username and password do not match any user in this service\"]");
    public By userNameErrorMessage = By.xpath("//*[text()=\"Epic sadface: Username is required\"]");
    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    public void insertUserName(String insertTextInUsernameField){
        driver.findElement(userName).sendKeys(insertTextInUsernameField);
    }
    public void insertPassword(String insertTextInPasswordField){
        driver.findElement(password).sendKeys(insertTextInPasswordField);
    }
    public void clickOnLogInButton(){
        driver.findElement(logInButton).click();
    }
    public String getErrorMessageText(){
        return driver.findElement(errorMessage).getText();
    }
    public String getUserNameErrorMessage(){
        return  driver.findElement(userNameErrorMessage).getText();
    }

    public void doLogInWithValidCredentials(){
        this.insertUserName("standard_user");
        this.insertPassword("secret_sauce");
        this.clickOnLogInButton();
    }





}
