package com.zubayer.Entities;

import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class SavingsAccount extends Account implements AccountAction {
    
    public SavingsAccount(String name, int accNumber, GregorianCalendar creationDate, double balance){
        super(name,accNumber,creationDate,balance,15.0,10.0);
    }
    
    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if(this.getBalance() - amount < this.getMinBalToKeep()){
            return false;
        } else {
            this.setBalance(this.getBalance()-amount);
            return true;
        }
    }
}
