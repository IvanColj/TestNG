package first;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends MajorTest {

    @Test
    @Parameters({"value", "isEven"})
    public void test_parameters(int value, boolean isEven){
        Assert.assertEquals(isEven, value * value > 100, "Квадрат числа меньше 100");
    }
}
