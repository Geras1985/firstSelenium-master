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
        String password = "QsI3Oy";
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
        driver.findElement(By.xpath("//button[@id='create-entity-2']//em")).click(); // add new CUSTOMER
        driver.findElement(By.xpath("//div[text()=' First Name']/input")).click();
        driver.findElement(By.xpath("//div[text()=' First Name']/input")).sendKeys("TEST");
        driver.findElement(By.xpath("//div[text()=' Email ']/input")).sendKeys("test@mail.ru");
        driver.findElement(By.xpath("//div[text()=' Email ']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Email ']/input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Last Name']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Last Name']/input")).sendKeys("L Test");
        driver.findElement(By.xpath("//div[text()=' BirthDate']//input")).click();
        driver.findElement(By.xpath("//div[text()=' BirthDate']//input")).sendKeys("2000-01-01");
        driver.findElement(By.xpath("//div[text()=' Citizenship']//descendant::span[3]")).click();
        driver.findElement(By.xpath("//span[text()='Armenia']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Gender* ']//select//option[text()='Male']")).click();
        driver.findElement(By.xpath("//div[text()=' Education* ']//select//option[text()='Master']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' BirthDate']//input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Next']")).sendKeys(Keys.PAGE_UP);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        // driver.findElement(By.xpath("//div[text()=' Passport Number']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Passport Number']//input")).sendKeys("AF0564482");
        driver.findElement(By.xpath("//div[text()=' Issued By']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Issued By']//input")).sendKeys("001");
        driver.findElement(By.xpath("//div[text()=' Valid Till']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Valid Till']//input")).sendKeys("2022-01-10");
        driver.findElement(By.xpath("//div[text()=' Social Security Number ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Social Security Number ']//input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).sendKeys("Mantashyan");
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.xpath("//div[text()=' Select Address Type * ']/select//option[3]")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Zip Postal Code ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Zip Postal Code ']//input")).sendKeys("008");
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Zip Postal Code ']//input")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//div[text()=' Country* ']//descendant::span[2]")).click();
        try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//span[text()='Andorra']")).click();
        try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' City* ']//descendant::span[2]")).click();
        driver.findElement(By.xpath("//span[text()='Andorra la Vella']")).click();
        try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).click();
        driver.findElement(By.xpath("//div[text()=' Street/Street Number* ']//input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Next']")).click();

    }
}
