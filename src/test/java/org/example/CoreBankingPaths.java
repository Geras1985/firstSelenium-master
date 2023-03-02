package org.example;

import java.util.List;

public class CoreBankingPaths {
    // Menu bar start
    public final static String minimizeMenu = "//a[@title='Minimize menu']";
    public final static String task = "//nav//a[@title='Tasks']";

    // Reports start
    public final static String reportsID = "//a[@id='reports-submenu']";
    public final static String transactionHistory = "//a[text()=' Transaction history ']";
    public final static String turnover = "//a[@title='Turnover']";
    // Reports end

    // Orders start
    public final static String ordersID = "//a[@id='orders']";
    public final static String memorialOrders = "//p[text()='Memorial Orders']";
    public final static String cashInOrders = "//p[text()='Cash-in Orders']";
    public final static String cashOutOrders = "//p[text()='Cash-out Orders']";
    //Orders end

    public final static String accounts = "//p[text()='Accounts']";
    // Customer Management start
    public final static String customerManagement = "//a[@title='Customer management']";
    public final static String clearFilter = "//span[text()=' Clear Filter ']";

    // Advanced Search start
    public final static String advancedSearch = "//span[text()=' Advanced Search ']";
    public final static String customerIDName = "//input[@name='customerId']";
    public final static String customerStatusName = "//input[@name='status']";
    public final static String genderName = "//input[@name='gender']";
    public final static String birthDateName = "//input[@name='customerBirthDate']";
    public final static String firstNameName = "//input[@name='firstName']";
    public final static String middleNameName = "//input[@name='middleName']";
    public final static String lastNameName = "//input[@name='lastName']";
    public final static String passportName = "//input[@name='passport']";
    public final static String idCardName = "//input[@name='idCard']";
    public final static String socialSecurityNumberName = "//input[@name='socialSecurityNumber']";
    public final static String phoneName = "//input[@name='phone']";
    public final static String emailName = "//input[@name='emailInput']";
    public final static String addressName = "//input[@name='street']";
    public final static String taxpayerIdName = "//input[@name='taxpayerId']";
    public final static String commercialNameName = "//input[@name='commercialName']";
    public final static String commercialAddressName = "//input[@name='commercialAddress']";
    public final static String search = "//span[text()='Search']";
    public final static String cancel = "//span[text()='Cancel']";
    // Advanced Search end

    // Create New Customer start
    public final static String createNewCustomer = "//span[text()=' Create a new customer ']";
    public final static String secondPhoneName = "//input[@name='phone']";
    public final static String citizenshipName = "//p-dropdown[@name='citizenship']";
    public final static String secondCitizenshipName = "//p-dropdown[@name='secondCitizenship']";
    public final static String residentName = "//input[@name='resident']";
    public final static String next = "//button[text()='Next']";
    public final static String back = "//button[text()='Back']";
    public final static String passportNumberName = "//input[@name='passportNumber']";
    public final static String issuedByName = "//input[@name='issuingAuthority']";
    public final static String validTillName = "//input[@name='dpPassport']";
    public final static String socialSecurityNumberIdentityValueName = "//input[@name='socialSecurityIdentityValue']";
    // Create New Customer end

    // Choose customer by id start
    public final static String createNewAccount = "//button[@id='createNewAccount']";

    // Create New Loan start
    public final static String createNewLoan = "//span[text()=' New Loan ']";
    public final static String save = "//span[text()='Save']";
    public final static String loanAgreementNumber = "//div[text()=' Agreement number: ']/strong"; //verjin@ sa em arel

    // Create New Loan end

    // Customer Management end

    public final static String cashDesk = "//p[text()='Cash desk']";
    public final static String exchangeRates = "//p[text()='Exchange Rates']";
    public final static String businessDay = "//p[text()='Business day']";
    // Settings start
    public final static String settings = "//p[text()='Settings']";
    public final static String chartOfAccounts = "//a[@title='Chart of Accounts']";
    public final static String loansNotesTree = "//a[@title='Loans notes tree']";
    public final static String commissions = "//a[@title='Commissions']";
    public final static String loanProducts = "//a[text()=' Loan products ']";
    //Settings end
    //Menu bar end


}
