package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium12 {
    //open app and verify title

    @Test
    public void testcase(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com");

//        String title = driver.getTitle();
//        System.out.println(title);
//        title.equalsIgnoreCase("Login - VWO");


        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
