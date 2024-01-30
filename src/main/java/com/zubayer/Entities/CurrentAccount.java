package com.zubayer.Entities;

import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class CurrentAccount extends Account implements AccountAction {

    private final double minOpenBalance = 10.0;
    private final double minBalToKeep = 5.0;
    
    CurrentAccount(String name, int accNumber, GregorianCalendar creationDate, double balance){
        super(name,accNumber,creationDate,balance);
    }

    public double getMinOpenBalance() {
        return minOpenBalance;
    }

    public double getMinBalToKeep() {
        return minBalToKeep;
    }
    
    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public double withdraw(double amount) {
        if(this.getBalance() - amount < minBalToKeep){
            return 0.0;
        } else {
            this.setBalance(this.getBalance()-amount);
            return amount;
        }
    }
    
}