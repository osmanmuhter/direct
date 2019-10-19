package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification  {

    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/","http://practice.cybertekschool.com/dropdown"
        ,"http://practice.cybertekschool.com/login");
  WebDriver myDriver = BrowserFactor.getDriver("chrome");
  myDriver.manage().window().fullscreen();
 myDriver.get(urls.get(0));
 Thread.sleep(4000);
     myDriver.navigate().to("http://youtube.com");
     Thread.sleep(4000);
     myDriver.navigate().back();
        Thread.sleep(4000);
        myDriver.navigate().forward();
        Thread.sleep(4000);
        System.out.println("the current title is " +myDriver.getTitle());
        System.out.println("And the current url is ");
        System.out.println(myDriver.getCurrentUrl());


String actualTitle = myDriver.getTitle();
        String expectedTitle = "Practice";
        if (actualTitle.equals(expectedTitle))
            System.out.println("passed");
        else {
            System.out.println("Failed");
            System.out.println("Expected title is "+ expectedTitle);
            System.out.println("Actual is " + actualTitle);
        }

        String souses = myDriver.getPageSource();
        // this method to get the sourse of the page

        myDriver.close();
        System.out.println(souses);

    }
}
