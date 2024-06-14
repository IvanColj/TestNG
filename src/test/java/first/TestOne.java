package first;

import org.testng.annotations.Test;

public class TestOne extends MajorTest {

    @Test (groups = "group2")
    public void ckeckSomething() {
        System.out.println("Hello world");
    }

    @Test(description = "Что-то проверяет", groups = "group1")
    public void checkSome() {
        System.out.println("Я метод тест");
    }
}

