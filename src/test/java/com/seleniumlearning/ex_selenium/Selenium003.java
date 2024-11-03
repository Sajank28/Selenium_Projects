package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium003 {

    @Test
    public void testMethod(){
        //import concept of OOPs
        //Upcasting -> Dynamic Dispatch
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
    }
}
