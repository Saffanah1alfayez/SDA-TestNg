package sda.tests.day18;

import org.testng.annotations.Test;

public class C03ParallelTestParameter03 {

    @Test(threadPoolSize = 4 , invocationCount = 8 , timeOut = 1000)
    public void test(){
        System.out.println("thread id is "+ Thread.currentThread().threadId());

    }
}
