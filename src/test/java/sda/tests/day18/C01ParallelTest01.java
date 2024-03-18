package sda.tests.day18;

import org.testng.annotations.Test;
import sda.utilities.TestBase;

// Thread.currentThread().getId(): Returns the ID of the thread executing the method.
// Since there is no interference when this class is executed, the execution is sequential.
// If we want to make the tests in this class run in parallel, we can configure it in the XML file.
public class C01ParallelTest01 {

    @Test
    public void test1(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 01 "+ threadName);

    }
    @Test
    public void test2(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 02 "+ threadName);
    }
    @Test
    public void test3(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 03 "+ threadName);
    }
    @Test
    public void test4(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 04 "+ threadName);
    }
    @Test
    public void test5(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 05 "+ threadName);
    }
    @Test
    public void test6(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 06 "+ threadName);
    }
    @Test
    public void test7(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 07 "+ threadName);
    }
    @Test
    public void test8(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread executing for Test 08 "+ threadName);
    }
}
