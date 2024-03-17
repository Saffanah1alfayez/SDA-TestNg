package sda.tests.day17;

import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class C04DataProviderFromAnotherclass extends TestBase {

     /*
        We can use our data by retrieving it from a different class; for this, we need to properly integrate the
        data provider method as a parameter into the test method.
        */

    @Test(dataProvider = "invalidCredentials" , dataProviderClass = C02DataProvider02.class)
    public void printCredentialsTest(String userName , String password){
        System.out.println("username : " + userName +   "       password : " + password);
    }

}
