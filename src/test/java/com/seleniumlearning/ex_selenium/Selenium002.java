package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium002 {

    @Test
    public void test_001(){
        WebDriver driver = new ChromeDriver(); //Upcasting or dynamic dispatch
        //creates a fresh copy of chrome browser -> unique session id is created -> POST request(session)

        driver.get("https://sdet.live");
        // driver is object reference -> GET to the URL (Navigate to URL)

        driver.quit();
        //closes the entire browser | Session ID = NULL
        //exit -> exits current tab | session id != NULL

    }
}
