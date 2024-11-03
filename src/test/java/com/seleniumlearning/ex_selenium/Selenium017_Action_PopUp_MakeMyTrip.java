package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium017_Action_PopUp_MakeMyTrip extends  OpenAndCloseEdgeBrowser {

    @Test
    public void actionsDemo() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");

        driver.navigate().to("https://www.makemytrip.com");

        //wait for popup to come and click x icon
        //span[@data-cy='closeModal']

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //wait until element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[@data-cy='closeModal']")));
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();


        WebElement fromCity = driver.findElement(By.id("fromCity"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();

//        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        for(WebElement e : list_auto_complete){
//            if(e.getText().contains("New Delhi")){
//                e.click();
//                break;
//            }
//        }


    }
}