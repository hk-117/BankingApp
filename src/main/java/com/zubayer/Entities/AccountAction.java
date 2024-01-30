package com.zubayer.Entities;

/**
 *
 * @author Md. Zubayer Islam
 */
public interface AccountAction {
    /*
        Different accounts may have these 
        functions common with different implementation
    */
    public void deposit(double amount);
    public boolean withdraw(double amount);
}
