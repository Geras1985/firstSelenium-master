package org.example;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Loan {
    @Test
    public void loanTest() {

        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver",
                "C:\\aaa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);


        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();
        try {Thread.sleep(8500);} catch (InterruptedException e) {e.printStackTrace();}
        String userName = "gerasimgh";
        String password = "WEKZpG";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//a[@title='Group loan']")).click(); //Loan
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Product ID ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Product ID ']//input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Customer ID']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Customer ID']//input")).sendKeys("93441856");
        driver.findElement(By.xpath("//div[text()=' Customer ID']//i")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Interest corresponding account ']//span[@class='p-dropdown-trigger-icon ng-tns-c82-10 pi pi-chevron-down']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()='212023000001 EUR']")).click();



    }
}