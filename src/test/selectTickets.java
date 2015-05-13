package test;

import org.junit.Test;
import page.homePage1;

public class selectTickets extends common{

    @Test
    public void selectAMovie(){
        new homePage1(driver)
                .clickMoviesTab();
    }
}
