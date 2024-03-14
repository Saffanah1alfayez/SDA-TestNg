package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class Hw1 extends TestBase {

    //Go to URL: https://www.google.com
    //diver.get("https://www.google.com");
    //Search words: Java, Selenium
    //Assert get text result est that the result text contains the searched Word.
    //Run tests from XML file.


    @Test
    @Parameters("Name")
    public void test1(String Name ) {
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(Name+ Keys.ENTER);

        WebElement java = driver.findElement(By.xpath("//span[text()='https://www.java.com']"));
        Assert.assertTrue(java.getText().contains("java"));
    }

    @Test
    @Parameters("name")
    public void test2(String name) {

        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(name+Keys.ENTER);
        WebElement sele = driver.findElement(By.xpath("//span[text()='https://www.selenium.dev']"));
        Assert.assertTrue(sele.getText().contains("selenium"));
    }
}
