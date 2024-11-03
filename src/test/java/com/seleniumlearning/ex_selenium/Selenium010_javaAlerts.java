package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium010_javaAlerts {

    @Test
    public void alertDemo(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        //1. JS Alert
        WebElement jsAlerts = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        jsAlerts.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        //2. JS Confirm
        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        jsConfirm.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        String result1 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result1,"You clicked: Ok");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


        //3. Js Prompt
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        jsPrompt.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Raj");
        alert2.accept();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result2,"You entered: Raj");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
