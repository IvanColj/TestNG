package first;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MajorTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Начало тестирования");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Конец тестирования");
    }
}


