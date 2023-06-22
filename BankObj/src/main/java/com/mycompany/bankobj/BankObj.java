package com.mycompany.bankobj;

public class BankObj 
{

    public static void main(String[] args) 
    {
        SavingAccount s1=new SavingAccount();
        s1.setBalance(1000000);
        s1.calculateInterest();
        
        CheckingAccount c1=new CheckingAccount();
        c1.setBalance(1000000);
        c1.calculateInterest();
    }
}
