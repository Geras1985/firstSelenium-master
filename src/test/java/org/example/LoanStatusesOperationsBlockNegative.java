package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoanStatusesOperationsBlockNegative {



    @Test
    public void loanStatusesNegativeTest() {
        LoanStatusesOperationsBlock block = new LoanStatusesOperationsBlock();

        System.setProperty("webdriver.chrome.driver",
                "C:\\Google Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("http://cbanking.tce.loc");
        driver.manage().window().maximize();

        //User username and password
        String userLog = "davitku";
        String userPass = "GorMar1512@";

        String lastLoanId;

        /*
         1.log in as an operator.
         2.Go to the "Customer Page" and search for any Customer.
         3.On the "Customer Page" details page, click on the "New Loan" link to create a new Loan.
         4.Select a Loan product, which has at least on undefined parameter (parameter with any range).
         5.Save the loan.
         6.Verify that Loan has been created in "Draft" status.
         7.Open the Loan detailed page and click on the "Edit" link.
         8.Fill all necessary fields and click save the loan.
         9.Verify that Loan has been created in "Ready for Approval" status.
         10.Open the Loan detailed view and click on the "Send to approval" link.
         11.Close the Loan detailed view, and verify that status of Loan has been changed to "Ready for approval" status.
         12.Open the Loan detailed page and click on the "Send to repair" link.
         13.Close the Loan detailed view, and verify that status of Loan has been changed to "Ready for Approval" status.
         14.Open the Loan detailed page and click on the "Send to approval" link.
         15.Close the Loan detailed view, and verify that status of Loan has been changed to "Approved" status.

         */

        System.out.println("1. Trying to log in...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));

        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userLog);
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(userPass);
        driver.findElement(By.xpath("//input[@class='fadeIn fourth float-end']")).click();
        System.out.println("true");

        System.out.println("2. Click the menu button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-bars']")));
        driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
        System.out.println("true");

        System.out.println("3. Click 'Customer management'");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='navbar navbar-tr blocked-menu']//a[@title='Customer management']")));
        driver.findElement(By.xpath("//nav[@class='navbar navbar-tr blocked-menu']//a[@title='Customer management']")).click();
        System.out.println("true");

        System.out.println("4. Select the customer with 63411170 id");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='selectable-row ng-star-inserted']/td[text()='63411170']")));
        driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted']/td[text()='63411170']")).click();
        System.out.println("true");

        System.out.println("5. Create New Loan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' New Loan ']")));
        driver.findElement(By.xpath("//span[text()=' New Loan ']")).click();
        System.out.println("true");

        String agreementNumber = driver.findElement(By.xpath("//div[text()=' Agreement number: ']/strong")).getText();

        System.out.println("6. Choose Loan Product Template");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c82-9 pi pi-chevron-down']")));
        driver.findElement(By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c82-9 pi pi-chevron-down']")).click();
        driver.findElement(By.xpath("//li/span[text()='Personal Loan']")).click();
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        System.out.println("true");

        System.out.println("7. Set Loan amount with 10.100");
        driver.findElement(By.xpath("//input[@name='customerLoanAmount']")).sendKeys("10100");
        System.out.println("true");

        System.out.println("8. Set Loan period with 12");
        driver.findElement(By.xpath("//input[@name='period']")).sendKeys("12");
        System.out.println("true");
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

        System.out.println("9. Add Loan Description with 'Automation Testing'");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='loanDescription']")));
        driver.findElement(By.xpath("//textarea[@name='loanDescription']")).sendKeys("Automation Testing");
        System.out.println("true");

        System.out.println("10. Push 'Save' button");
        jse.executeScript("window.scroll(0,1500)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Save']")));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Save']"))).click();
        }catch (Exception e){
            jse.executeScript("window.scrollBy(0,1000)");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Save']"))).click();
        }
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        System.out.println("true");

        block.loanStatusesTest();

    }
}
