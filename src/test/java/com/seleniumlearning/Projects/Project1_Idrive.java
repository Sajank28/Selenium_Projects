package com.seleniumlearning.Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Project1_Idrive {

    @Description("verify free trial expire message in idrive.com")
    @Test
    public void idrive360(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.idrive360.com/enterprise/login");

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement email_id = driver.findElement(By.id("username"));
//        WebElement email_id = driver.findElement(By.xpath("username"));
        email_id.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        WebElement remember_me = driver.findElement(By.className("id-checkmark"));
        remember_me.click();


        WebElement submit = driver.findElement(By.id("frm-btn"));
        submit.click();

        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
