package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLogin {

    public void adminLogin(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Google Driver\\chromedriver.exe");

        WebDriver driver = Helper.driver;
        WebDriverWait wait = Helper.wait;

        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();

        //User username and password
        String userLog = "admin";
        String userPass = "admin1234!@#$";

        System.out.println("1. Trying to log in...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        driver.findElement(By.id("username")).sendKeys(userLog);
        driver.findElement(By.id("password")).sendKeys(userPass);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        System.out.println("true");
    }
}
