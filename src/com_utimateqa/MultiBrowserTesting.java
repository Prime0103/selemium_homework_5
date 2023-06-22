package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("FireFox")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver.getTitle());

        System.out.println("Current URL : " + driver.getCurrentUrl());

        System.out.println("Page Source: " + driver.getPageSource());

        //Find the Email Field Element
        WebElement username = driver.findElement(By.name("user[email]"));
        username.sendKeys("jpatel@gmail.com");

        //enter password in password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc123");

        //close the browser
        driver.close();

    }
}
