package first;

import functions.functions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo {

    private final functions functions = new functions();
    private final int NUMBER = 121;

    @Test
    public void test_privacy() {
        boolean expectedResult = true;
        boolean actualResult = functions.privacy(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "Не пройден");
    }

    @Test
    public void test_smallest() {
        int expectedResult = 2;
        int actualResult = functions.smallest(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "не пройден");
    }

    @Test
    public void test_root_number() {
        int expectedResult = 11;
        int actualResult = functions.root_number(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "Не пройден");
    }
}

