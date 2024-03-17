package sda.tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class C02DataProvider02 extends TestBase {

    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ''Invalid credentials'’ is displayed.

    By userNameFiled = By.name("username");
    By passwordFiled = By.name("password");
    By buttonTag = By.tagName("button");
    By textXpath = By.xpath("//*[.='Invalid credentials']");

    @Test(dataProvider = "invalidCredentials")
    public void negativeLoginTest(String userName, String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(userNameFiled).sendKeys(userName);
        driver.findElement(passwordFiled).sendKeys(password);
        driver.findElement(buttonTag).click();
        Thread.sleep(1000); //explicet wite
        WebElement invalidText = driver.findElement(textXpath);
        Assert.assertTrue(invalidText.isDisplayed());


    }

    @DataProvider(name = "invalidCredentials")
    public Object[][] getData() {

        return new Object[][]{{"adm", "123"},
                              {"Auudmin", "admin123"}
                ,             {"admin", "admin9123"}
                ,             {"Admmin", "Admin123"}
                ,             {"admi ", "admin123"}
                ,             {"Admin", "98809-0 "}


        };

    }

















}

