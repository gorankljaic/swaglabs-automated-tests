package AppTests;

import Pages.LogInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class LogInTest extends BaseClass {

    LogInPage logInPage = new LogInPage(driver);

    @Test
    public void loginWithValidUserNameAndPassword() {
        logInPage.doLogInWithValidCredentials();
        String wantedResult = driver.findElement(By.xpath("//*[text()=\"Products\"]")).getText();
        String actualResult = "PRODUCTS";
        Assert.assertEquals("We are not logged in ", wantedResult, actualResult);
    }

    @Test
    public void logInWithValidUserNameAndIncorrectPassword() {
        logInPage.insertUserName("standard_user");
        logInPage.insertPassword("sifrajesifra");
        logInPage.clickOnLogInButton();
        String actualResult = "Epic sadface: Username and password do not match any user in this service";
        String wantedResult = logInPage.getErrorMessageText();
        Assert.assertEquals("Message about wrong input is not displayed", actualResult, wantedResult);
    }

    @Test
    public void logInWithIncorrectUserNameAndValidPassword() {
        logInPage.insertUserName("babyiscrying@gmail.com");
        logInPage.insertPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        String expectedResult = "Epic sadface: Username and password do not match any user in this service";
        String actualResult = logInPage.getErrorMessageText();
        Assert.assertEquals("Message about wrong input is not displayed", expectedResult, actualResult);
    }

    @Test
    public void loginWithIncorrectUserNameAndPassword() {
        logInPage.insertUserName("RunGoRun99@gmail.com");
        logInPage.insertPassword("asisimambo1923");
        logInPage.clickOnLogInButton();
        String actualResult = "Epic sadface: Username and password do not match any user in this service";
        String expectedResult = logInPage.getErrorMessageText();
        Assert.assertEquals("Message about wrong input is not displayed", actualResult, expectedResult);
    }

    @Test
    public void logInWithoutUserNameAndPassword() {
        logInPage.insertUserName("");
        logInPage.insertPassword("");
        logInPage.clickOnLogInButton();
        String expectedResult = logInPage.getUserNameErrorMessage();
        String actualResult = "Epic sadface: Username is required";
        Assert.assertEquals("Message about wrong input is not displayed", expectedResult, actualResult);
    }

}
