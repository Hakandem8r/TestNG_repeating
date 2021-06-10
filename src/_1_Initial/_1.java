package _1_Initial;

import org.testng.annotations.Test;

public class _1 {

    @Test(priority = 1) //Önce voidleri yaz, sonra @Test sonra da priority'leri anlat
    void website(){
        System.out.println("Driver is complete and the website is opened...");
    }

    @Test(priority = 2)
    void loginTest(){
        System.out.println("Login test functions were done");
    }

    @Test(priority = 3)
    void driverClose(){
        System.out.println("Driver was closed and out of the system");
    }
}
