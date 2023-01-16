package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v89.indexeddb.model.Key;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.KeyFactory;

public class CustomerManag {

    @Test
    public void customerTest() {


        System.setProperty("webdriver.chrome.driver",
                "C:\\aaa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();
        try {Thread.sleep(12000);} catch (InterruptedException e) {e.printStackTrace();}
        String userName = "gerasimgh";
        String password = "WEKZpG";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(3500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//a[@title='Customer management']")).click(); //Customer management
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[2]//input")).click();
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[2]//input")).sendKeys("59");
//        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[3]//input")).click();
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[3]//input")).sendKeys("an");
//        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[4]//input")).click();
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[4]//input")).sendKeys("oxo");
//        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[5]//input")).click();
//        driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[5]//input")).sendKeys("ox");
//        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//button[@id='create-entity']")).click();
//        driver.findElement(By.xpath("//button[@id='advanced-search']")).click();
//        driver.findElement(By.xpath("//div[text()=' FirstName: ']//following-sibling::div/input")).click();
//        driver.findElement(By.xpath("//div[text()=' FirstName: ']//following-sibling::div/input")).sendKeys("on");
//        driver.findElement(By.xpath("//div[text()=' FirstName: ']//following-sibling::div/input")).sendKeys(Keys.PAGE_DOWN);
//        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//span[text()='Search']")).click();
//        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
//        driver.findElement(By.xpath("//span[text()=' Clear Filter ']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[@id='create-entity-2']//em")).click();


    }
}
