package com.mycompany.bankaccountobj2;
public class CheckingAccount extends BankAccount {
    private static final double CHECKING_RATE=0.02;
    @Override
    public double calculateInterest() {
        return getBalance()*CHECKING_RATE;
    }
}
