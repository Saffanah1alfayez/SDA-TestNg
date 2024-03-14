package sda.tests.day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03UsingParameters {

    @Test
    @Parameters("name")
    public void parametrizedTest(String name){
        System.out.println("welcome  " + name);
    }
    @Test
    @Parameters({"name" , "surname" , "age"} )
    public void threepratest(String name , String surname , String age){
        System.out.println("Hello " + " " +name + " " +surname + " " + age);
    }

}
