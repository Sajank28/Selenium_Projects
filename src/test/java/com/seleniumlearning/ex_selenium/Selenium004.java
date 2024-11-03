package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium004 {
    //EdgeOptions -> It will help you set the browser
    // options to browsers
    //Window - size
    // Headless mode - There is no UI -> advantage -> fast execution
    // full Ui mode - default - UI browser
    // incognito mode -> switch

    @Test
    public void testMethod(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        //to add extension
        edgeOptions.addExtensions(new File("path of downloaded extension file"));


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
//        driver.manage().window().maximize();
    }
}
