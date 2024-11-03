package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium014_WebTable2 {

    //a webtable is a way of representing data in rows and columns
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
          driver = new EdgeDriver();
    }

    @Test
    public void webTableDemo(){
        driver.manage().window().maximize();
        String url = "https://awesomeqa.com/webtable1.html";
        driver.get(url);

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        //rows and colmns

        List<WebElement> rows_Table = table.findElements(By.tagName("tr"));
        for(int i =0;i<rows_Table.size();i++){
            List<WebElement> col_Table = rows_Table.get(i).findElements(By.tagName("td"));
            for(WebElement c : col_Table){
                System.out.println(c.getText());
            }
        }






    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
