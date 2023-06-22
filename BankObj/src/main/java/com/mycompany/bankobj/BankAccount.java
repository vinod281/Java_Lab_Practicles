package com.mycompany.bankobj;


abstract class BankAccount 
{
    private int accountNumber;
    protected double balance;
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    
    public int getAccountNumber()
    {
       return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public abstract void calculateInterest();
}
