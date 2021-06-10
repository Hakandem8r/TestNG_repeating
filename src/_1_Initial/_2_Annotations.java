package _1_Initial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _2_Annotations {

    @BeforeClass
    void beforeClass(){
        System.out.println("It will work before every single class : Before Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("It will work before every single method : Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("It will work after every single method : After Method");
    }

    @Test
    void test1(){
        System.out.println("This is the test1 ");
    }

    @Test
    void test2(){
        System.out.println("This is the test 2");
    }
}
