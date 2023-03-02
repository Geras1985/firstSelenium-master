package org.example;

import org.example.enums.FeeType;
import org.testng.annotations.Test;

public class MyTests {
    private final String CUSTOMER_ID = "63411170";
    private final String TEMPLATE_NAME = "Personal Loan";

    private final FeeType feeType = FeeType.NON_CASH;
    UpfrontFee upfrontFee = new UpfrontFee();
    Loan loan = new Loan();



    @Test
    public void upfrontFeeTest(){
        upfrontFee.upfrontFeeNonCashTest(CUSTOMER_ID, TEMPLATE_NAME, feeType);
    }
    @Test
    public void createNewLoanTest(){
        loan.createNewLoanTest(CUSTOMER_ID, TEMPLATE_NAME);
    }
}
