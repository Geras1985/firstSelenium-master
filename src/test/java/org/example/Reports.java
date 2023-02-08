package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Reports {
 @Test
    public  void reportsTest(){

        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver",
                "C:\\aaa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);


        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();
        try {Thread.sleep(8500);} catch (InterruptedException e) {e.printStackTrace();}
        String userName = "gerasimgh";
        String password = "vaC1zB";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//a[@id='reports-submenu']")).click(); //Reports
        driver.findElement(By.xpath("//a[text()=' Transaction history ']")).click();
        driver.findElement(By.xpath("//div[text()=' Transaction status ']//descendant::div[@role='button']")).click();
        driver.findElement(By.xpath("//span[text()='SUCCESS']")).click();
        driver.findElement(By.xpath("//div[text()=' Currency ']//span[@class='p-dropdown-trigger-icon ng-tns-c82-6 pi pi-chevron-down']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()='EUR']")).click();
        driver.findElement(By.xpath("//div[text()=' Amount ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Amount ']//input")).sendKeys("20");
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Amount ']//input")).clear();
        driver.findElement(By.xpath("//div[text()=' Amount ']//input")).sendKeys("2");
     try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
     driver.findElement(By.xpath("//button[text()='Reset Filter']")).click();

        driver.findElement(By.xpath("//div[text()=' Date/Time from ']//descendant::span[@class='p-button-icon pi pi-calendar']")).click();
        driver.findElement(By.xpath("//tbody[@class='ng-tns-c70-3']/tr[2]/td[2]")).click();
        driver.findElement(By.xpath("//a[text()='Ok']")).click();
        driver.findElement(By.xpath("//div[text()=' Transaction status ']//descendant::div[@role='button']")).click();
        driver.findElement(By.xpath("//span[text()='UNKNOWN ']")).click();
        driver.findElement(By.xpath("//div[text()=' Currency ']//span[@class='p-dropdown-trigger-icon ng-tns-c82-6 pi pi-chevron-down']")).click();
        driver.findElement(By.xpath("//div[text()='AMD']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Reset Filter']")).click();

    }
}
