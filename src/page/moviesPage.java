package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class moviesPage {
    private FirefoxDriver driver;

    public moviesPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    private WebElement firstMovie(){
        return driver.findElement(By.cssSelector("a.mvCnt"));
    }

    public moviesPage clickOnFirstMovie(){
        firstMovie().click();
        return this;
    }

    public moviesPage checkIfMovieTitleIs(String moviename){
        Assert.assertEquals(moviename, driver.findElement(By.id("spnEventTitle")).getText());
        return this;
    }
}
