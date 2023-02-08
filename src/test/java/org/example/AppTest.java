package org.example;


import io.opentelemetry.sdk.internal.SystemClock;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest {
    @Test
   public void first() {

    System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver",
                "C:\\aaa\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);



       // driver.get("https://robinpowered.com");
        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();
        try {Thread.sleep(8500);} catch (InterruptedException e) {e.printStackTrace();}
        String userName = "gerasimgh";
        String password = "QsI3Oy";
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        driver.findElement(By.xpath("//a[@id='orders']")).click(); //order
        driver.findElement(By.xpath("//a[@title='Memorial Order']")).click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//em[@class='fa fa-plus']")).click();
        driver.findElement(By.xpath("//input[@id='amou']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='debitAccoun']")).click();
        String debit = "330030000001";
        String credit = "2333330000001";
        driver.findElement(By.xpath("//input[@id='debitAccoun']")).click();
        driver.findElement(By.xpath("//input[@id='debitAccoun']")).sendKeys(debit);
        driver.findElement(By.xpath("//input[@id='creditAccoun']")).click();
        driver.findElement(By.xpath("//input[@id='creditAccoun']")).sendKeys(credit);
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//div[@class='row debit-item singleMode']/div/div/div/button"))
                .click();
        try {Thread.sleep(2500);} catch (InterruptedException e) {e.printStackTrace();}
        driver.findElement(By.xpath("//input[@name='documentNumber']")).click();


      //  driver.findElement(By.xpath("//button[@class='ui-plus-blue ng-star-inserted']/span")).click();
       // driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();

    }

}
