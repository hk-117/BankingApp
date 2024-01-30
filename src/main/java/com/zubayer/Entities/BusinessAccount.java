package com.zubayer.Entities;

import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class BusinessAccount extends Account implements AccountAction {
    
    public BusinessAccount(String name, int accNumber, GregorianCalendar creationDate, double balance){
        super(name,accNumber,creationDate,balance,150.0, 50.0);
    }
    
    @Override
    public void deposit(double amount) {
        /*
            Encouraging Business Account holder to deposit more.
            Giving extra 5.00
        */
        if(amount > 1000){
            this.setBalance(this.getBalance() + amount + 5.00);
        } else {
            this.setBalance(this.getBalance() + amount);
        }
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
