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
        try {Thread.sleep(17500);} catch (InterruptedException e) {e.printStackTrace();}
        String adminLog = "admin";
       // String adminLog = "gerasimgh";
       // String adminPass = "oIcQkZ";
        String adminPass = "admin1234!@#$";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(adminLog);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(adminPass);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        try {Thread.sleep(3500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//p[text()='Loan products']")).click(); //Loan
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath(" //span[text()=' Add New Product Template ']")).click();
        try {Thread.sleep(19500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan name']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Loan name']/input")).sendKeys("test0");
        try {Thread.sleep(4500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Product ID ']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Product ID ']/input")).sendKeys("11110000");
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan period']//div[@role='button']")).click();
        driver.findElement(By.xpath("//span[text()='Monthly']")).click();
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='loanPeriodMin']")).click();
        driver.findElement(By.xpath("//input[@name='loanPeriodMin']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@name='loanPeriodMax']")).click();
        driver.findElement(By.xpath("//input[@name='loanPeriodMax']")).sendKeys("18");
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='loanPeriodMax']")).click();
        driver.findElement(By.xpath("//input[@name='loanPeriodMax']")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//div[text()=' Loan currency']//div[@role='button']")).click();
        try {Thread.sleep(2200);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//span[text()='EUR']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan amount']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Loan amount']/input")).sendKeys("1000");
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='loanAmountMax']")).click();
        driver.findElement(By.xpath("//input[@name='loanAmountMax']")).sendKeys("5000");
        try {Thread.sleep(2200);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan maturity type ']//div[@role='button']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//span[text()='Annuity']")).click();
        driver.findElement(By.xpath("//input[@name='minInterest']")).click();
        driver.findElement(By.xpath("//input[@name='minInterest']")).sendKeys("3");
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='maxInterest']")).click();
        driver.findElement(By.xpath("//input[@name='maxInterest']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@name='maxInterest']")).sendKeys(Keys.TAB);
        try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Repayment Type']//div[@role='button']")).click();
        driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//span[text()='Monthly']")).click();
        driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']//span[text()='Monthly']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//div[text()=' Loan interest calculation option ']//div[@role='button']")).click();
        driver.findElement(By.xpath("//span[text()='Actual days / 365']")).click();
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Real overdue ']/input")).click();
        driver.findElement(By.xpath("//div[text()=' Real overdue ']/input")).sendKeys(Keys.PAGE_DOWN);
        try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//button[text()='Next ']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[text()=' Loan Account GL Code']//i")).click();



    }
}