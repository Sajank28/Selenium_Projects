package com.seleniumlearning.ex_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Selenium001 {

@Test
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Which browser you want to run ? Chrome or Firefox ");
            String webDriver = sc.next();

            WebDriver driver;

            switch (webDriver){
                case "Chrome":
                    driver = new ChromeDriver();
                    driver.get("https://app.vwo.com");
                    break;
                case "Firefox":
                    driver = new FirefoxDriver();
                    driver.get("https://app.vwo.com");
                    break;
//                case "Chromium":
//                    driver = new ChromiumDriver();
//                    driver.get("https://app.vwo.com");
//                    break;
                default :
                    System.out.println("Browser not supported");
            }
    }
}
