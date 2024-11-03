package com.seleniumlearning.Projects;

import io.qameta.allure.Description;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Project4_AccountCreated {

    @Description("Register in  https://awesomeqa.com/ui/index.php?route=account/register")
    @Test
    public void register(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");

        //Personal Details
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Rajeshwar");
        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Gowda");
        WebElement eMail = driver.findElement(By.id("input-email"));
        eMail.sendKeys("Rajgowda69@gmail.com");
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("8561231231");

        //Your Password
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("12345Raj");
        WebElement password_Confirm = driver.findElement(By.id("input-confirm"));
        password_Confirm.sendKeys("12345Raj");

        //Newsletter
        WebElement subscribe = driver.findElement(By.xpath("//input[@name=\"newsletter\"and @value=\"1\"]"));
        subscribe.click();

        //Click on privacy policy
        WebElement policy = driver.findElement(By.cssSelector(".agree"));
        policy.click();

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement policy_Close = driver.findElement(By.xpath("//button[@class=\"close\"]"));
        policy_Close.click();

        WebElement policyPolicy_Click = driver.findElement(By.xpath("//input[@name=\"agree\"]"));
        policyPolicy_Click.click();

        WebElement continue_Button = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
        continue_Button.click();


        driver.quit();
    }
}
