package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Selenium005 {

    @Test
    public void navigateDemo(){
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.navigate().to("https://sdet.live");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
    }
}
