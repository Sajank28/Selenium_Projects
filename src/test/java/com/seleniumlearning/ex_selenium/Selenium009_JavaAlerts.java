package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium009_JavaAlerts {

    @Test
    public void javaAlerts(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        //1
       WebElement alertJs = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
       alertJs.click();

       driver.switchTo().alert().accept();

//       or
//        Alert alert = driver.switchTo().alert();
//        alert.accept();


        //2
        WebElement alertConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        alertConfirm.click();

        driver.switchTo().alert().accept();

  //3
        WebElement alertPrompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        alertPrompt.click();
        driver.switchTo().alert().sendKeys("Raj");
        driver.switchTo().alert().accept();

        String result = driver.findElement(By.id("result")).getText();


        Assert.assertEquals(result,"You entered: Raj");
//
//        driver.close();
    }
}
