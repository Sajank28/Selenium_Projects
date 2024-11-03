package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium008_Sleep {

    //Implicit wait
    //Explicit Wait

    @Test
    public void explicitWait(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com/#/login");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);



    }
}
