package com.mycompany.bankaccountobj2;
public class BankAccountObj2 {

    public static void main(String[] args) {
        CheckingAccount p=new CheckingAccount();
        p.setBalance(1000000);
        System.out.println("Checking account Interest : "+p.calculateInterest());
        
        SavingAccount p2=new SavingAccount();
        p2.setBalance(20000000);
        System.out.println("Saving Account Interest   : "+p2.calculateInterest());
    }
}
