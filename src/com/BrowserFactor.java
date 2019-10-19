package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class BrowserFactor {
    public static WebDriver getDriver(String chrom) {
        if(chrom  == "chrome")  {
            System.setProperty("webdriver.chrome.driver","/Users/osman/Documents/selenium dependencies /drivers/chromedriver");
            return new ChromeDriver() ;
        }
        else if (chrom == "firefox") {
            System.setProperty("webdriver.gecko.driver","/Users/osman/Documents/selenium dependencies /drivers/geckodriver");
            return new FirefoxDriver();
        }
        return null;
    }
    public static void main(String[] args) {

WebDriver driver1 = getDriver("chrome");

        driver1.get("http://baidu.com");


    }}
