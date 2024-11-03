package com.seleniumlearning.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment2 {

    @Test
    public void assignment2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Verified");
            Assert.assertTrue(true);
        }else{
            System.out.println("Not Verified");
            Assert.assertTrue(false);
        }

        driver.quit();


    }
}
