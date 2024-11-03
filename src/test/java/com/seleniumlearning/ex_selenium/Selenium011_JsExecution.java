package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium011_JsExecution {


    @Test
    public void jsExecution(){ WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor)driver;


        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='user']"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

//        Thread.sleep(3000);

        //js.executeScript("window.scrollBy(0,500);");




    }
}
