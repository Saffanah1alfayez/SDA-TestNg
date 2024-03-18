package sda.tests.day18;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

 import static sda.utilities.TestBase.driver;

public class C02ParallelTest02 extends TestBase {

    @Test
    public void test01(){

        new ChromeDriver().get ("https://www.clarusway.com");
    }
  @Test
    public void test02(){
        new ChromeDriver().get("https://www.facebook.com");
    }
    @Test
    public void test03(){
        new ChromeDriver().get("https://www.amazon.com");
    }
    @Test
    public void test04(){
        new ChromeDriver().get("https://www.google.com");
    }
}
