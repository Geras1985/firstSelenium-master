package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SettingsLoan {

    @Test
    public void settingLoan() {


        System.setProperty("webdriver.chrome.driver",
                "C:\\aaa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();
        try {Thread.sleep(12000);} catch (InterruptedException e) {e.printStackTrace();}
        String userName = "gerasimgh";
        String password = "vaC1zB";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(3500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//p[text()='Settings']")).click();
        try {Thread.sleep(800);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//a[text()=' Loan products ']")).click();
        try {Thread.sleep(1800);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[@id='create-entity']//em")).click();
        try {Thread.sleep(800);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan name']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Loan name']/input")).sendKeys("ATest Loan");
        driver.findElement(By.xpath("//div[text()=' Description ']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Description ']/input")).sendKeys("Atest");
        driver.findElement(By.xpath("//div[text()=' Product ID ']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Product ID ']/input")).sendKeys("11");
        try {Thread.sleep(800);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan period']//div[@role='button']")).click();
        driver.findElement(By.xpath("//span[text()='Yearly']")).click();
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='loanPeriodMin']")).click();
        driver.findElement(By.xpath("//input[@name='loanPeriodMin']")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan currency']//div[@role='button']/span")).click();
        driver.findElement(By.xpath("//span[text()='USD']")).click();
        driver.findElement(By.xpath("//div[text()=' Loan amount']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Loan amount']/input")).sendKeys("1000");


    }
}
