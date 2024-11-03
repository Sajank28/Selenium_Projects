package com.seleniumlearning.ex_selenium;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium015_Actions extends OpenAndCloseEdgeBrowser {

    //Action class is an ability provided by selenium for handling keyboard and mouse events

//    Perform Mouse Hover Action on the Web Element
//**moveToElement**(live).build().perform();
//**doubleClick()**: Performs double click on the element
//    clickAndHold(): Performs long click on the mouse without releasing it
//    dragAndDrop(): Drags the element from one point and drops to another
//    moveToElement(): Shifts the mouse pointer to the center of the element
//    contextClick(): Performs right-click on the mouse Keyboard Actions in Selenium
//    sendKeys(): Sends a series of keys to the element
//    keyUp(): Performs key release
//    keyDown(): Performs keypress without release.

    @Test
    public void actionsDemo(){
    driver.navigate().to("https://awesomeqa.com/practice.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        //Keyboards -> keydown -> press hold shift -> send key -> key up

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy").keyUp(Keys.SHIFT).build().perform();
    }
}
