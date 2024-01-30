package com.zubayer.Entities;

import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class CurrentAccount extends Account implements AccountAction {
    
    public CurrentAccount(String name, int accNumber, GregorianCalendar creationDate, double balance){
        super(name,accNumber,creationDate,balance,10.0,5.0);
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
