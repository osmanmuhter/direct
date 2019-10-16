package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver",
               "/Users/osman/Documents/selenium dependencies /drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }
}
