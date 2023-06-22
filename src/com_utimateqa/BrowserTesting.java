package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserTesting
{
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";

        //setup the browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);

        //maximise the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title page
        String title = driver.getTitle();
        System.out.println(title);

        //get the current url
        System.out.println("current url : " + driver.getCurrentUrl());

        //get the page source
        System.out.println("page source : " + driver.getPageSource());

        //get the email in emailfield
        WebElement username =driver.findElement(By.name("user[email]"));
        username.sendKeys("jaimini234@gmail.com");

        //enter password in password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("qwe12");

        //close the browser
        driver.close();

    }
}
