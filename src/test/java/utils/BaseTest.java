package utils;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected static PropertiesReader propertiesReader = new PropertiesReader();

    @BeforeTest
    public void setUp() {
        System.out.println("This test is started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("This test is completed");
    }

    protected int get3DigitRandomInt() {
        return RandomUtils.nextInt(100, 999);
    }

}

