package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium016_Actions_SpiceJet extends OpenAndCloseEdgeBrowser{

    @Test
    public void actionsDemo(){
        driver.navigate().to("https://spicejet.com");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
//        source.sendKeys("BLR");

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

    }

}
