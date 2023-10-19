package com.mycompany.bankaccountobj2;
public abstract class BankAccount {
    private int accountNo;
    private double balance;
    
    //setter methods
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;  
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    //getter methods
    public int getAccountNo(){
        return this.accountNo;
    }
    public double getBalance(){
        return this.balance;
    }
    abstract double calculateInterest();
}
