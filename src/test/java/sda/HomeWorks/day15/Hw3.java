package sda.HomeWorks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw3 extends TestBase {
    /*
    Test Case3: Negative Password Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field.
    Type password incorrectPassword into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your password is invalid!
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("Pass123");

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

        //Verify error message is displayed.
        Thread.sleep(5000);

        WebElement eM = driver.findElement(By.id("error"));
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(eM.isDisplayed());

        //Verify error message text is Your password is invalid!
        sa.assertTrue(eM.getText().contains("Your password is invalid!"));

        sa.assertAll();
    }
}
