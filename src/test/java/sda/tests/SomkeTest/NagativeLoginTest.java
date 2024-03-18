package sda.tests.SomkeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class NagativeLoginTest extends TestBase {
    @Test(dataProvider = "getData")
    public void test(String userName , String password) throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.click(); username.sendKeys(userName);

        WebElement pass = driver.findElement(By.id("password"));
        pass.click(); pass.sendKeys(password); //incorrect password

        WebElement sub = driver.findElement(By.id("submit")); sub.click();

        //Verify error message is displayed.
        Thread.sleep(5000);

        WebElement eM = driver.findElement(By.id("error"));
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(eM.isDisplayed());

        //Verify error message text is Your password is invalid!
        sa.assertTrue(eM.getText().contains("invalid!"));

        sa.assertAll();
    }
    @DataProvider
    public Object[][] getData() {
        Faker faker = new Faker();
        return new Object[][]{{faker.name().username(), faker.internet().password()},
                              {faker.name().username(), faker.internet().password()},
                              {faker.name().username(), faker.internet().password()},
                              {faker.name().username(), faker.internet().password()},
                              {faker.name().username(), faker.internet().password()},};
    }
    }
