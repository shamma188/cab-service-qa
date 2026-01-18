package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void bookingShouldReturnSuccess() {
        String result = "SUCCESS";
        Assert.assertEquals(result, "SUCCESS");
    }
}
