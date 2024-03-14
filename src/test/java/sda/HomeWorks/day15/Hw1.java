package sda.HomeWorks.day15;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw1 extends TestBase {
    /*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/
    @Test
    public void testHardAssert() {

        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("Password123");

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/

        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        System.out.println("URL Hard Assert test is passed.....");

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')

        WebElement con = driver.findElement(By.xpath("//p[@class='has-text-align-center']"));
        Assert.assertTrue(con.getText().contains("Congratulations"));
        System.out.println("Congratulations Hard Assert  test passed ....");

        //Verify button Log out is displayed on the new page.

        WebElement but = driver.findElement(By.xpath("//*[.='Log out']"));
        Assert.assertTrue(but.isDisplayed());
        System.out.println("button Hard Assert test is passed ...");

    }

    @Test
    public void softAssertTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("Password123");

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
