package com.mycompany.bankaccountobj2;
public class SavingAccount extends BankAccount{
    private static final double SAVINGS_RATE=0.12;
    @Override
    public double calculateInterest() {
        return getBalance()*SAVINGS_RATE;
    }

    
   
}
