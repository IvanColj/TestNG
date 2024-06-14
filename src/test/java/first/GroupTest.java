package first;

import functions.functions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest extends MajorTest {

    private final functions functions = new functions();
    private final int NUMBER = 144;

    @Test (groups = "group1")
    public void test_privacy() {
        boolean expectedResult = true;
        boolean actualResult = functions.privacy(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "Не пройден");
    }

    @Test (groups = "group1")
    public void test_smallest() {
        int expectedResult = 2;
        int actualResult = functions.smallest(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "не пройден");
    }

    @Test (groups = "group1", dependsOnMethods = "test_privacy")
    public void test_root_number() {
        int expectedResult = 12;
        int actualResult = functions.root_number(NUMBER);

        Assert.assertEquals(actualResult, expectedResult, "Не пройден");
    }

    @Test (groups = "group2", dependsOnMethods = "checkAdd")
    public void ckeckSomething() {
        System.out.println("Hello world");
    }

    @Test (groups = "group2")
    public void checkSome() {
        System.out.println("Я метод тест");
    }
}
