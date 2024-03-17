package sda.tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class C01DataProvider extends TestBase {
    /*
    @DataProvider is a TestNG annotation.
    Therefore, it is used exclusively with TestNG.
    It is used to provide data / obtain a list of data in TestNG.
    It is used for Data Driven Testing (DDT).
    It serves the same purpose as Scenario Outline in Cucumber.
    How to pass data from one method to another using DataProvider?

    Use the dataProvider in the test method and set the description equal to the method name.
    We can provide an alternative name using "name = "alternative name".
    */
     By sb = By.id("gh-ac");
    @Test(dataProvider = "getData")
    public void searchTest(String sKey)  {
        driver.get("https://www.ebay.com/");
       WebElement sBox =  driver.findElement(sb);
        sBox.sendKeys( sKey , Keys.ENTER);

    }
    @DataProvider
    public Object [][] getData() {
        Object[][] data = {{"java"},{"javaScript"},{"phyton"}};
        return data;

    }




    @Test(dataProvider = "Saffanah")
    public void searchTest1(String sKey)  {
        driver.get("https://www.ebay.com/");
        WebElement sBox =  driver.findElement(sb);
        sBox.sendKeys( sKey , Keys.ENTER);

    }
    @DataProvider(name = "Saffanah")
    public Object [][] getData2() {
        Object[][] data = {{"iphone"}
                         ,{"android"}
                          ,{"laptop"}
        };
        return data;

    }

    @Test(dataProvider = "Saffanah1")
    public void searchTest2(String sKey)  {
        driver.get("https://www.ebay.com/");
        WebElement sBox =  driver.findElement(sb);
        sBox.sendKeys( sKey , Keys.ENTER);

    }
    @DataProvider(name = "Saffanah1")
    public Object [][] getData3() {
        return new Object[][]{
                 {"iphone"}
                ,{"android"}
                ,{"laptop"}
        };

    }











}














//        Thread.sleep(1000);
//        driver.findElement(sb).clear();
//        s.clear();
//        s.sendKeys("javaScript" , Keys.ENTER);
//
//        s.clear();
//        s.sendKeys("phyton" , Keys.ENTER);
