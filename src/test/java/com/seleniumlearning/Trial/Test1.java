package com.seleniumlearning.Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void ableSpace(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ablespace.io/");

        driver.findElement(By.xpath("//a[@class=\"rounded-lg border-2 border-[#318AE5] bg-[#318AE5] px-7 py-2.5 font-semibold text-white duration-150 hover:opacity-90\"]")).click();


        driver.findElement(By.id("email")).sendKeys("sajan2588@gmail.com");
        driver.findElement(By.xpath("//button[@class=\"w-full inline-flex justify-center rounded-md border border-transparent shadow-sm text-base font-medium  focus:outline-none sm:w-auto sm:text-sm bg-blue-primary px-6 py-3 mt-4 !w-full !text-lg hover:bg-blue-700 text-white cursor-pointer\"]")).click();

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@placeholder=\"James Musk\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//button[@class=\"focus:border-blue-m500 bg-grey-200 placeholder:not-italic placeholder:text-grey-t600 text-grey-t800 border-grey-300 relative w-full flex justify-between items-center gap-x-2 cursor-pointer rounded-lg px-3  py-2 sm:py-2  pl-3 pr-10 text-left text-grey-t800   bg-white py-1 border border-grey-400 focus:border-2 focus:border-blue-600 rounded-lg h-12 focus:px-[11px] md:focus:px-[15px] text-base text-grey-t800  m_8fb7ebe7 mantine-Input-input mantine-TextInput-input\"]")).click();
        driver.findElement(By.id(":rc:")).click();

        driver.findElement(By.xpath("//input[@class=\" px-3 py-2 md:px-4 md:py-2.5 !text-gray-700 !bg-white border border-grey-400 focus:border-2 focus:border-blue-600 h-12 focus:px-[11px] md:focus:px-[15px] bg-gray-100 px-3 rounded-lg border border-grey-300 !py-2.25    focus:border-blue-primary focus:border \"]")).sendKeys("12345678$And");
//        driver.quit();
    }
}
