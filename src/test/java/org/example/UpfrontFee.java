package org.example;

import org.example.enums.FeeType;

public class UpfrontFee {

    public void upfrontFeeNonCashTest(String customerID, String templateName, FeeType feeType) {
        OperatorLogin operatorLogin = new OperatorLogin();
        operatorLogin.operatorLogin();

        System.out.print("2. ");
        Helper.menu();

        System.out.print("3. ");
        Helper.customerManagement();

        System.out.print("4. ");
        Helper.chooseCustomerById(customerID);

        System.out.print("5. ");
        Helper.createNewLoan();

        System.out.print("6. ");
        Helper.chooseLoanProductTemplate(templateName);

        System.out.print("7. ");
        Helper.pageDown();
        Helper.fillFields(templateName);

        System.out.print("8. ");
        Helper.save();

        System.out.print("9. ");
        Helper.chooseLoanByAgreementNumber(Helper.agreementNumber);

        System.out.print("10. ");
        Helper.pageUp();
        Helper.sendToApproval();

        System.out.print("11. ");
        Helper.approveLoan();

        System.out.print("12. ");
        Helper.upfrontFeeChargingOrGranting(feeType);


    }
}
