package sda.tests.day15;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08AssertionInfo {

    @Test
    public void hardAssertion(){
        // Hard assertions are methods that we call through the Assert class.
        // If any assertion fails during test execution, the test execution stops at that moment.
        System.out.println("testing eaqulity 0f 3=3");
        Assert.assertEquals(3,3); //passed
        //Assert.assertTrue(3==3); //another way of assert

        System.out.println("testing eaqulity 0f 3=3");
        Assert.assertEquals(3,4); //failed, execution stops here

        System.out.println("Will this message appear in the console?");//This message won't appear..
        Assert.assertEquals(3,3); // here stop due to hard assert




        //this line won't be executed as the program crashes after a hard assertion failure
    }

    @Test
    public void softAssertion(){
        // Soft assertion - verification; test execution continues even if assertions fail.
        SoftAssert sa = new SoftAssert(); //first step
        System.out.println("Testing Equality of 3=4");
        sa.assertEquals(3,4); //second step ---//failed, but it doesn't underline..


        System.out.println("Testing for equality of 3=3");
        sa.assertEquals(3,3); //passed

        sa.assertAll(); //third step and important step

        // If not used, all assertions are written in vain.
        // This method puts all assertions into action.
        // If there is any failure, it underlines it in yellow.
        
        System.out.println("Will this message appear in the console?");//This message won't appear..

        // Soft assert continues to work even if an error is found, and this continuation feature is valid until assertAll().
    }
}
