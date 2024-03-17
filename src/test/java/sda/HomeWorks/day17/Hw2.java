package sda.HomeWorks.day17;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilities.ParameterizedBrowserTestBase;
import sda.utilities.TestBase;

import java.util.List;

/*
Go to URL: http://crossbrowsertesting.github.io/todoapp.html
Checking Box todo-4 and Checking Box todo-5
If both clicks worked, then the following List should be have length 2.
Assert that this is correct
Assert that the todo we added is present in the list
Archiving old todos
If our archive link worked, then the following list should have length 4.
Assert that this is true as well
Doing Cross Browser Testing.
 */
public class Hw2 extends ParameterizedBrowserTestBase {
     By checkBoxs = By.xpath("//*[@type='checkbox']");
     By selectChec = By.xpath("//*[@class='done-true']");
     By todo = By.id("todotext");
     By newCheckBox = By.xpath("//*[@class='done-false']");

    @Test
    public void test() {

        driver.get("https://vziad3.github.io/todo-app/todo-app.html");

        List<WebElement> check = driver.findElements(checkBoxs);
        check.get(3).click();
        check.get(4).click();
        List<WebElement> select = driver.findElements(selectChec);
        Assert.assertEquals(select.size(), 2);
        driver.findElement(todo).sendKeys("Test the website");
        driver.findElement(By.id("addbutton")).click();
        WebElement newcheck = driver.findElement(By.xpath("//*[.='Test the website']"));
        Assert.assertTrue(newcheck.isDisplayed());
        driver.findElement(By.xpath("//*[.='archive'] ")).click();

        List<WebElement> newCheck = driver.findElements(newCheckBox);
        Assert.assertEquals(newCheck.size(), 4);

    }
}
