package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium019_realTimeMostPollutedCity extends OpenAndCloseEdgeBrowser  {

    @Test
    public void realTimeRanking() throws InterruptedException{
        driver.manage().window().maximize();
        driver.navigate().to("https://www.aqi.in/in/real-time-most-polluted-city-ranking");

        Thread.sleep(5000);

        WebElement searchBox = driver.findElement(By.id("search_city"));
        searchBox.sendKeys("India"+ Keys.ENTER);

        List<WebElement> list_of_states = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));

        for(WebElement l : list_of_states){
            System.out.println(l.getText());
            String s1 = driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
        }
    }
}
