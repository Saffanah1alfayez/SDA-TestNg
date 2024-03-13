package sda.HomeWorks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw2 extends TestBase {
/*
        Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Click Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!

     */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("stu");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("Password123");

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

    //Verify error message is displayed.
        Thread.sleep(5000);

        WebElement eM = driver.findElement(By.id("error"));
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(eM.isDisplayed());

    //Verify error message text is Your username is invalid!
        sa.assertTrue(eM.getText().contains("Your username is invalid!"));

        sa.assertAll();
    }
}
