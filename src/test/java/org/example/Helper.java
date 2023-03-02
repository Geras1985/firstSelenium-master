package org.example;

import org.example.enums.FeeType;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends CoreBankingPaths{

    static WebDriver driver = new ChromeDriver();
    static String agreementNumber;
    static WebDriverWait wait = new WebDriverWait(driver, 30);

    static JavascriptExecutor jse = (JavascriptExecutor) driver;

    static String template = null;

    private static void getRandomInteger(String byName) {

        driver.findElement(By.name(byName)).clear();
        String interestRateText = driver.findElement(By.name(byName)).getAttribute("placeholder");
        String[] s = interestRateText.split(" ");
        s[0] = s[0].replace(",", "").replace(".", "");
        s[2] = s[2].replace(",", "").replace(".", "");
        int s0 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[2]);
        int from;
        int to;
        if (s0 > 100) {
            from = s0 / 100;
            to = s2 / 100;
        } else {
            from = s0;
            to = s2;
        }
        int random_int = (int) Math.floor(Math.random() * (to - from + 1) + from);

        driver.findElement(By.name(byName)).sendKeys("" + random_int + "");
    }

    public static void pageUp() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
        jse.executeScript("window.scroll(1000,0)");
    }

    public static void pageDown() {
        jse.executeScript("window.scroll(0,1000)");
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
    }

    public static void chooseCustomerById(String customerId) {
        System.out.println("Select the customer with " + customerId + " id");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='selectable-row ng-star-inserted']/td[text()='" + customerId + "']")));
        driver.findElement(By.xpath("//tr[@class='selectable-row ng-star-inserted']/td[text()='" + customerId + "']")).click();
        System.out.println("true");
    }

    public static void menu() {
        System.out.println("Click the menu button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(minimizeMenu)));
        driver.findElement(By.xpath(minimizeMenu)).click();
        System.out.println("true");
    }

    public static void customerManagement() {
        System.out.println("Click 'Customer management'");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customerManagement)));
        driver.findElement(By.xpath(customerManagement)).click();
        System.out.println("true");
    }

    public static void tasks() {
        System.out.println("Click 'Tasks'");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(task)));
        driver.findElement(By.xpath(task)).click();
        System.out.println("true");
    }

    public static void createNewLoan() {
        System.out.println("Create New Loan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createNewLoan)));
        driver.findElement(By.xpath(createNewLoan)).click();
        agreementNumber = driver.findElement(By.xpath(loanAgreementNumber)).getText();
        System.out.println("true");
    }

    public static void chooseLoanProductTemplate(String templateName) {
        template = templateName;
        System.out.println("Choose Loan Product Template");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c82-9 pi pi-chevron-down']")));
        driver.findElement(By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c82-9 pi pi-chevron-down']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/span[text()='" + templateName + "']")));
        driver.findElement(By.xpath("//li/span[text()='" + templateName + "']")).click();
        System.out.println("true");
    }

    public static void save() {
        System.out.println("After that save the loan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(save)));
        try {
            driver.findElement(By.xpath(save)).click();
        } catch (Exception e) {
            pageDown();
            driver.findElement(By.xpath(save)).click();
        }
        driver.findElement(By.xpath(save)).click();
        System.out.println(true);
    }

    public static void saveOne() {
        System.out.println("After that save the loan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(save)));
        try {
            driver.findElement(By.xpath(save)).click();
        } catch (Exception e) {
            pageDown();
            driver.findElement(By.xpath(save)).click();
        }
        System.out.println(true);
    }

    public static void chooseLoanByAgreementNumber(String agreementNumber) {
        System.out.println("Choose the loan whose agreement number is: " + agreementNumber);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=' " + agreementNumber + " ']")));
            driver.findElement(By.xpath("//td[text()=' " + agreementNumber + " ']")).click();
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        } catch (Exception e) {
            pageDown();
            driver.findElement(By.xpath("//td[text()=' " + agreementNumber + " ']")).click();
        }
        System.out.println(true);
    }

    public static void fillFields(String templateName) {

        switch (templateName) {
            case "Car Loan" -> {
                System.out.println("Selected the '" + templateName + "' template");
                pageDown();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='loanDescription']")));
                System.out.println("Fill Loan Description");
                driver.findElement(By.xpath("//textarea[@name='loanDescription']")).sendKeys("Automation Testing - " + templateName);
                System.out.println(true);
            }
            case "Personal Loan" -> {
                System.out.println("Selected the '" + templateName + "' template");
                System.out.println(true);
                System.out.println("Fill Loan Amount field");
                driver.findElement(By.name("customerLoanAmount")).clear();
                getRandomInteger("customerLoanAmount");
                System.out.println(true);
                System.out.println("Fill Loan period");
                driver.findElement(By.name("period")).clear();
                getRandomInteger("period");
                System.out.println(true);
                System.out.println("Fill Interest rate");
                driver.findElement(By.name("interestRate")).clear();
                getRandomInteger("interestRate");
                System.out.println(true);
                System.out.println("Fill Loan Description");
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='loanDescription']")));
                driver.findElement(By.xpath("//textarea[@name='loanDescription']")).sendKeys("Automation Testing - " + templateName);
                System.out.println(true);
            }
            default -> System.out.println("No such loan template found");

        }
    }

    public static void sendToApproval() {
        System.out.println("Send to approval");
        try {
            driver.findElement(By.xpath("//div[text()=' Send to approval ']")).click();
        } catch (Exception e) {
            pageUp();
            pageUp();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Send to approval ']")));
            driver.findElement(By.xpath("//div[text()=' Send to approval ']")).click();
        }
        driver.findElement(By.xpath("//button[@type='button']/span[text()='Yes']")).click();
        System.out.println(true);
    }

    public static void approveLoan() {
        System.out.println("Approve loan");
        try {
            driver.findElement(By.xpath("//div[text()=' Approve Loan ']")).click();
        } catch (Exception e) {
            pageUp();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Approve Loan ']")));
            driver.findElement(By.xpath("//div[text()=' Approve Loan ']")).click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']/span[text()='Yes']")));
        driver.findElement(By.xpath("//button[@type='button']/span[text()='Yes']")).click();
        System.out.println(true);
    }

    public static void upfrontFeeChargingOrGranting(FeeType feeType) {
        System.out.println("Upfront fee charging or Granting");
        WebElement upfrontFeeCharging = driver.findElement(By.xpath("//div[text()='Upfront fee charging ']"));
        WebElement element = driver.findElement(By.xpath("//div[text()='Upfront fee charging ']"));
        if (upfrontFeeCharging!=null)
        try {
            driver.findElement(By.xpath("//div[text()='Upfront fee charging ']")).click();
        } catch (Exception e) {
            pageUp();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Upfront fee charging ']")));
            driver.findElement(By.xpath("//div[text()='Upfront fee charging ']")).click();

        }
        System.out.println(true);
        feeTypes(feeType);
    }

    private static void feeTypes(FeeType feeType) {
        switch (feeType.toString()) {
            case "CASH" -> {
                driver.findElement(By.xpath("//div[@role='dialog']")).sendKeys(Keys.PAGE_DOWN);
                saveOne();
            }
            case "NON_CASH" -> {
                driver.findElement(By.xpath("//p-radiobutton[@value='NON_CASH']")).click();
                saveOne();
            }
        }
    }
}
