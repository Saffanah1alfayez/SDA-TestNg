package sda.tests.day17;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import sda.utilities.ParameterizedBrowserTestBase;
import sda.utilities.TestBase;

public class C05CrossBrowserTesting extends ParameterizedBrowserTestBase {

    @Test
    public void test1(){driver.get("https://www.clarusway.com./");}

    @Test
    public void test2(){driver.get("https://www.ebay.com/");}

    @Test
    public void test3(){driver.get("https://www.linkedin.com/");}

    @Test
    public void test4(){driver.get("https://www.clarusway.com./");}
}
