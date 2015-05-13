package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class selectMovie extends common{

    @Test
    public void selectFirstMovie(){
        driver.findElement(By.cssSelector("#movies a")).click();
        driver.findElement(By.cssSelector("a.mvCnt")).click();
        Assert.assertEquals("Purampokku Engira Podhuvudamai (U/A)", driver.findElement(By.id("spnEventTitle")).getText());
    }

    @Test
    public void seeEvents(){
        driver.findElement(By.cssSelector("#events a")).click();
    }

    @Test
    public void selectAMovie(){
        new page.homePage(driver)
                .clickMoviesTab()
                .clickOnFirstMovie()
                .checkIfMovieTitleIs("Purampokku Engira Podhuvudamai (U/A)");
    }

    

}
