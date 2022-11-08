package com.juaracoding.posttestdelapabelas.pageobject.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
