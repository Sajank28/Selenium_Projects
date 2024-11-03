package com.seleniumlearning.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class Assignment1 {

    @Test
    public void assignment1(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
    }
}
