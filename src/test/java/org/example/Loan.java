package org.example;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Loan extends OperatorLogin{

    public void createNewLoanTest(String customerId, String templateName) {

        operatorLogin();

        System.out.print("2. ");
        Helper.menu();

        System.out.print("3. ");
        Helper.customerManagement();

        System.out.print("4. ");
        Helper.chooseCustomerById(customerId);

        System.out.print("5. ");
        Helper.createNewLoan();

        System.out.print("6. ");
        Helper.chooseLoanProductTemplate(templateName);

        System.out.print("7. ");
        Helper.fillFields(templateName);

        System.out.print("8. ");
        Helper.save();

        System.out.println("FINISH");
    }
}


































































































































































































