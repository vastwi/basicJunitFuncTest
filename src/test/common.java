package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class common {
    static FirefoxDriver driver;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        String baseUrl = "http://in.bookmyshow.com/trichy";
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
