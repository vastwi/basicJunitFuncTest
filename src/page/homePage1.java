package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homePage1 {
    private final FirefoxDriver driver;

    public homePage1(FirefoxDriver driver){
        this.driver = driver;
    }

    private WebElement moviesTab(){
        return driver.findElement(By.cssSelector("li#movies a"));
    }

    public homePage1 clickMoviesTab(){
        moviesTab().click();
        return this;
    }
}
