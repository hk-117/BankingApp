package com.zubayer.Entities;

import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class SavingsAccount extends Account implements AccountAction {
    private static final double MIN_OPEN_BALANCE = 15.0;
    
    public SavingsAccount(String name, int accNumber, GregorianCalendar creationDate, double balance){
        super(name,accNumber,creationDate,balance,10.0);
    }
    
    public static double getMinOpenBalance() {
        return MIN_OPEN_BALANCE;
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
