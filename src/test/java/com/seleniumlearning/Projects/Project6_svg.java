package com.seleniumlearning.Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Project6_svg {

    @Description("Verify that after search results are visible")
    @Test
    public void test_flipkart_search(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.flipkart.com/");

        //step 1 - Enter macmini in input box
        driver.findElement(By.name("q")).sendKeys("macmini");

        //step 2 - click on svg search element
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\")]//a[2]"));
        for(int i = 0;i < titleResults.size(); i++) {
            System.out.println("Title : " + titleResults.get(i).getText());
            System.out.println();
        }

        driver.close();


    }
}
