package _1_Initial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_Assertions {

    @Test
    void assertEqualExample(){
        String s1="Alex";
        String s2="Sara";

        Assert.assertEquals(s1,s2);
    }


    @Test
    void assertTrueExample(){
        int num1=9;
        int num2=8;

        Assert.assertTrue(num1==num2);
    }

    String s;

    @Test
    void nullExample(){
        String s=""; //=> Bu kısmı yoruma alırsak yukarıdaki s'ten dolayı çalışır.

        Assert.assertNull(s);
    }
}
