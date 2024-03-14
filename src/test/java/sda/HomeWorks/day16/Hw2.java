package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw2 extends TestBase {
    @Test
    @Parameters({"username" , "password"})
    public void softAssertTest(String username , String password) {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys(username + Keys.ENTER);


        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password + Keys.ENTER);

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

        SoftAssert sa = new SoftAssert();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/

        sa.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        System.out.println("URL Soft Assert test is passed.....");

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')

        WebElement con = driver.findElement(By.xpath("//p[@class='has-text-align-center']"));
        sa.assertTrue(con.getText().contains("Congratulations"));
        System.out.println("Congratulations  Soft Assert test passed ....");

        //Verify button Log out is displayed on the new page.

        WebElement but = driver.findElement(By.xpath("//*[.='Log out']"));
        sa.assertTrue(but.isDisplayed());
        System.out.println("button Soft Assert test is passed ...");

        sa.assertAll();
    }
}



