package com.seleniumlearning.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Project7_OrangeHRM {
    //admin Hacker@4321
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void find_Terminated_employee(){
        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/hr/web/index.php/auth/login";
        driver.get(URL);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }


        WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        userName.sendKeys("admin");

        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("Hacker@4321");

        WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login.click();

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

//Scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement table = driver.findElement(By.xpath("//div[@role=\"table\"]"));

        //ROW
        // //div[@class="oxd-table-body"]/div[@class="oxd-table-card"]/div[@role="row"]/div[@role="cell"]

        //find status
        // //div[contains(@class,'oxd-table-cell')][6]

        List<WebElement> tableRow = table.findElements(By.xpath("//div[@role=\"row\"]"));
        for(int i = 0;i< tableRow.size();i++){
            List<WebElement> tableCol = tableRow.get(i).findElements(By.xpath("//div[@role=\"cell\"]"));
            for(WebElement c:tableCol){
//                String status = tableCol.get(i).findElement(By.xpath("//div[contains(@class,'oxd-table-cell')][6]")).getText();
//
//                Assert.assertEquals(status,"Terminated");
            }
        }
    }

    @AfterTest
    public void closeBrowser(){

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
