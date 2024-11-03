package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenAndCloseEdgeBrowser {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();

    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
