package com.seleniumlearning.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium007 {
    //Locators - Find web elements

    @Description("Verify that with invalid email , Error msg is shown")
    @Test
    public void testVWOLogin(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com/#/login");

        //email Input box
       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys("admin123@gmail.com");

       //Enter passowrd
        WebElement passInputBox = driver.findElement(By.name("password"));
        passInputBox.sendKeys("pass123");

        //Click sign in button
        WebElement signInButton = driver.findElement(By.id("js-login-btn"));
        signInButton.click();

        //3 seconds wait
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        //Error message notification
        WebElement errorMessage = driver.findElement(By.id("js-notification-box"));
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");


        //Quit browser
        driver.quit();
    }

}
