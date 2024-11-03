package com.seleniumlearning.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Project5_Practice {

    @Test
    public void basicHtml(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://awesomeqa.com/practice.html");

        try {
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstName.sendKeys("Sajan");
        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Kamath");
        WebElement gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
        gender.click();
        WebElement yoe = driver.findElement(By.id("exp-2"));
        yoe.click();
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("28/10/1999");
        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();
//        WebElement automationTools = driver.findElement(By.id("tool-2"));
//        automationTools.click();
        WebElement continents = driver.findElement(By.id("continents"));
        continents.click();
        continents.click();


//        WebElement seleniumCommands = driver.findElement(By.xpath(""));
        WebElement image = driver.findElement(By.id("photo"));
        image.click();
        WebElement download = driver.findElement(By.linkText("Click here to Download File"));
        download.click();
        WebElement button = driver.findElement(By.id("submit"));
        button.click();













    }
}
