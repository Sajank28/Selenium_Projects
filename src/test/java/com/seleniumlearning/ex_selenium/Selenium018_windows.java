package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium018_windows extends OpenAndCloseEdgeBrowser {

    @Test
    public void windowsParent(){
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle : "+parentWindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles :  "+windowHandles);

        for(String handle:windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test case passed");
                break;
            }
        }


    }
}
