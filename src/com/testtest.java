package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testtest {
    public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver",
               "/Users/osman/Documents/selenium dependencies /drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://youtube.com");

    }
}
