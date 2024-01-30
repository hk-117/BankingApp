package com.zubayer.Entities;
/**
 *
 * @author Md. Zubayer Islam
 */

import java.util.GregorianCalendar;

public abstract class Account {
    private String name;
    private final int accNumber;
    private final GregorianCalendar creationDate;
    private double balance;

    Account(String name, int accNumber, GregorianCalendar creationDate, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public GregorianCalendar getCreationDate() {
        return creationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
