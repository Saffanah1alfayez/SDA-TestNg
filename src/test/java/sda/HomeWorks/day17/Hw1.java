package sda.HomeWorks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

/*
Open the site: http://opencart.abstracta.us/index.php?route=account/login
Login with that credentials
Email: clarusway@gmail.com
Password: 123456789
Using the Search function do it with Data Provider for Mac, iPad and Samsung.
 */
public class Hw1 extends TestBase {
    By emailFiled = By.id("input-email");
    By passwordFiled = By.id("input-password");
    By button =By.xpath("//*[@value='Login']");
    By searchFiled = By.name("search");
    @Test(dataProvider = "getData")
    public void test(String keyword) {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.findElement(emailFiled).sendKeys("clarusway@gmail.com");
        driver.findElement(passwordFiled).sendKeys("123456789");
        driver.findElement(button).click();
        driver.findElement(searchFiled).sendKeys(keyword , Keys.ENTER);


    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{"Mac"}, {"iPad"} , {"Samsung"}};
                return data;
    }
}
