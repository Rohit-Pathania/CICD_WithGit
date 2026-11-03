package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class LoginTest extends BaseClass {

    @Test
    public void verifyLoginPageOpens() {


        // 1. URL is correct
        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        // 2. Page title is correct
        Assert.assertEquals(driver.getTitle(), "Account Login");

        // 3. Login form is visible
        Assert.assertTrue(driver.findElement(By.id("input-email")).isDisplayed());
    }
}