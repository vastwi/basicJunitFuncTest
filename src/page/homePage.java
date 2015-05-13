package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homePage {
    private FirefoxDriver driver;

    public homePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    private WebElement moviesTab()
    {
        return driver.findElement(By.cssSelector("#movies a"));
    }

    public moviesPage clickMoviesTab(){
        moviesTab().click();
        return new moviesPage(driver);
    }
}
