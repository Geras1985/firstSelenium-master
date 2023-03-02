package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class LoanStatusesOperationsBlock {
    @Test
    public void loanStatusesTest() {


        System.setProperty("webdriver.chrome.driver",
                "C:\\Google Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

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

        System.out.println("5. How many loans we have, with status 'Draft'?");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ArrayList<String> draftLoansId = new ArrayList<>();

        for (int i = 1; i < 50; i++) {
            if (driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted'][" + i + "]/td[2]/parent::*//em")).getAttribute("title").equals("DRAFT")) {
                String text = " " + driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted'][" + i + "]/td[2]")).getText() + " ";
                draftLoansId.add(text);
                String innerText = driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted'][" + i + "]")).getAttribute("innerText");
                System.out.println(innerText);
            } else if (driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted'][" + i + "]/td[3]/parent::*//em")).getAttribute("title").equals("CLOSED") ||
                    driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted'][" + i + "]/td[3]/parent::*//em")).getAttribute("title").equals("REJECTED")) {
                break;
            }
        }
        System.out.println("We have " + draftLoansId.size() + " loans");
        System.out.println(draftLoansId);

        lastLoanId = draftLoansId.get(draftLoansId.size() - 1);
        System.out.println("6. Choose the last loan");
        if (draftLoansId.size() != 0) {
            try {
                driver.findElement(By.xpath("//td[text()='" + draftLoansId.get(draftLoansId.size() - 1) + "']")).click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("Scroll down the page for to find that loan");
                jse.executeScript("window.scroll(0,500)");
            }
            driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']")).click();

            try {
                System.out.println("7. After choosing click 'Edit Loan' link");
                driver.findElement(By.xpath("//div[text()=' Edit loan ']")).click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("Scroll to the top of the page to find loan 'OPERATIONS' where there is 'Edit loan' link");
                jse.executeScript("window.scroll(1000,0)");
                driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
            }
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Edit loan ']")));
            driver.findElement(By.xpath("//div[text()=' Edit loan ']")).click();

        } else {
            System.out.println("There are no any draft loans");
        }

        driver.findElement(By.tagName("body")).sendKeys(Keys.TAB);
        System.out.println("8. Fill the required fields for change loan status from 'DRAFT' to 'ACTIVE'");
//        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);


        jse.executeScript("window.scroll(0,700)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='customerLoanAmount']")));

        System.out.println("9. Fill the 'Loan amount' field with 10.100");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='customerLoanAmount']")));
        driver.findElement(By.xpath("//input[@name='customerLoanAmount']")).clear();
        driver.findElement(By.xpath("//input[@name='customerLoanAmount']")).sendKeys("10100");
        System.out.println("true");

        System.out.println("10. Fill the 'Loan period' field with 12");
        driver.findElement(By.xpath("//input[@name='period']")).clear();
        driver.findElement(By.xpath("//input[@name='period']")).sendKeys("12");
        System.out.println("true");

        driver.findElement(By.name("interestRate")).clear();
        String interestRateText = driver.findElement(By.name("interestRate")).getAttribute("placeholder");
        String[] s = interestRateText.split(" ");
        int from = Integer.parseInt(s[0]);
        int to = Integer.parseInt(s[2]);

        int random_int = (int) Math.floor(Math.random() * (to - from + 1) + from);

        driver.findElement(By.name("interestRate")).sendKeys("" + random_int + "");

        System.out.println("11. Scroll down and fill the 'Loan Description' fill with 'Automation Testing'");
        jse.executeScript("window.scroll(0,1000)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='loanDescription']")));
        driver.findElement(By.xpath("//textarea[@name='loanDescription']")).sendKeys("Automation Testing");
        System.out.println("true");

        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

        System.out.println("12.  After that push the 'Save' button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Save']")));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath("//span[text()='Save']")).click();
        } catch (Exception e) {
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
            driver.findElement(By.xpath("//span[text()='Save']")).click();
        }
        System.out.println("true");

        System.out.println("13.  After that again push the 'Save' button");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        System.out.println("true");

        System.out.println("14. Find the loan by Id " + lastLoanId + " and check the status․ It should be 'READY FOR APPROVAL'");

        if (driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']//parent::*//em")).getAttribute("title").equals("READY FOR APPROVAL")) {
            System.out.println("true");
        }

        System.out.println("15. After that should be send to approval");

        try {
            driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']")).click();

        } catch (Exception e) {
            jse.executeScript("window.scroll(0,1000)");
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='" + lastLoanId + "']")));
            driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']")).click();
        }
        System.out.println("true");

        System.out.println("16. Send to approval");
        try {
            jse.executeScript("window.scroll(1000,0)");
            driver.findElement(By.xpath("//div[text()=' Send to approval ']")).click();

        } catch (Exception e) {
            jse.executeScript("window.scroll(1000,0)");
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Send to approval ']")));
            driver.findElement(By.xpath("//div[text()=' Send to approval ']")).click();
        }
        driver.findElement(By.xpath("//button[@type='button']/span[text()='Yes']")).click();

        System.out.println("true");


        if (driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']//parent::*//em")).getAttribute("title").equals("WAITING FOR APPROVAL")) {
            System.out.println("true");
        }
        System.out.println("17. After that should be approve loan");
        try {
            driver.findElement(By.xpath("//div[text()=' Approve Loan ']")).click();
        } catch (Exception e) {
            jse.executeScript("window.scroll(1000,0)");
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
        }
        driver.findElement(By.xpath("//button[@type='button']/span[text()='Yes']")).click();
        System.out.println("true");

        System.out.println("18. The loan status just be 'APPROVED'");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='" + lastLoanId + "']//parent::*//em")));
        if (driver.findElement(By.xpath("//td[text()='" + lastLoanId + "']//parent::*//em")).getAttribute("title").equals("APPROVED")) {
            System.out.println("true");
        }
        System.out.println("FINISHED!!!");
    }
}


































































































































































































