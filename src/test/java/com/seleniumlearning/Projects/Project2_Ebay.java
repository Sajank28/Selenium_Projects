package com.seleniumlearning.Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project2_Ebay {

    @Description("Open ebay.com search for an item and print all the available results (title and price) and find max n min price")
    @Test
    public void ebay_com(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ebay.com/");

        WebElement search_Text = driver.findElement(By.id("gh-ac"));
        search_Text.sendKeys("macmini");

        WebElement click_Search = driver.findElement(By.id("gh-btn"));
        click_Search.click();

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        List<WebElement> item_Title = driver.findElements(By.xpath("//div[@class= \"s-item__title\"]/span"));
        //List<WebElement> item_Title = driver.findElements(By.cssSelector(".s-item__title"));
        List<WebElement> item_Price = driver.findElements(By.cssSelector(".s-item__price"));

        int size =Math.min(item_Title.size(),item_Price.size());
        for(int i = 0;i < size; i++) {
            System.out.println("Title : " + item_Title.get(i).getText() + " | " + " Price : " + item_Price.get(i).getText());
            System.out.println();
        }
            //Max price and min price
            ArrayList<Double> prices = new ArrayList<>();

            // Regular expression to match prices
            String priceRegex = "\\$([0-9]+\\.?[0-9]*)";
            Pattern pattern = Pattern.compile(priceRegex);

            // Loop through each WebElement and extract the price
            for (WebElement element : item_Price) {
                String priceText = element.getText(); // Get the text containing the price
                Matcher matcher = pattern.matcher(priceText);
                while (matcher.find()) {
                    // Add price to the list (parse as double)
                    prices.add(Double.parseDouble(matcher.group(1)));
                }
            }

            // Find the minimum and maximum prices
            double minPrice = Collections.min(prices);
            double maxPrice = Collections.max(prices);

            // Display results
            System.out.println("Minimum Price: $" + minPrice);
            System.out.println("Maximum Price: $" + maxPrice);




        driver.quit();

    }
}
