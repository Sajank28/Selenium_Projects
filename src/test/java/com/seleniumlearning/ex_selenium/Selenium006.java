package com.seleniumlearning.ex_selenium;

import org.openqa.selenium.Proxy;
import org.testng.annotations.Test;


public class Selenium006 {

    @Test
    public void session006(){
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("188.255.245.205:1080");
//        options.setCapability("proxy",proxy);
    }
}
