package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw3 extends TestBase {
    /*
Test Case3: Parametrized Negative Test
Open page https://practicetestautomation.com/practice-test-login/
Try to login with correct user name and wrong password
And wrong user name and correct password
And wrong user name and wrong password
And empty user name correct password
Verify error message is displayed.
     */
    @Test
    @Parameters({"username" , "password"})
    public void softAssertTest(String username , String password) throws InterruptedException {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys(username + Keys.ENTER);


        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password + Keys.ENTER);

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

        //Verify error message is displayed.
        Thread.sleep(5000);

        WebElement eM = driver.findElement(By.id("error"));
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(eM.isDisplayed());


    }
}


