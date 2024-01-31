package com.zubayer.Controllers;

import com.zubayer.Entities.*;
import java.util.GregorianCalendar;

/**
 *
 * @author Md. Zubayer Islam
 */
public class AccountFactory {
    public Account makeAccount(String name, int accNumber, GregorianCalendar creationDate, double initialBalance, String accType){
        switch(accType){
            case "Current":
                if(initialBalance < CurrentAccount.getMinOpenBalance()){
                    System.out.println("Please, make a deposit at least " + CurrentAccount.getMinOpenBalance());
                } else {
                    return new CurrentAccount(name,accNumber,creationDate,initialBalance);
                }
                break;
                
            case "Savings":
                if(initialBalance < SavingsAccount.getMinOpenBalance()){
                    System.out.println("Please, make a deposit at least " + SavingsAccount.getMinOpenBalance());
                } else {
                    return new SavingsAccount(name,accNumber,creationDate,initialBalance);
                }
                break;
            
            case "Salary":
                if(initialBalance < SalaryAccount.getMinOpenBalance()){
                    System.out.println("Please, make a deposit at least " + SalaryAccount.getMinOpenBalance());
                } else {
                    return new SalaryAccount(name,accNumber,creationDate,initialBalance);
                }
                break;
            
            case "Business":
                if(initialBalance < BusinessAccount.getMinOpenBalance()){
                    System.out.println("Please, make a deposit at least " + BusinessAccount.getMinOpenBalance());
                } else {
                    return new BusinessAccount(name,accNumber,creationDate,initialBalance);
                }
                break;
                        
        }
        return null;
    }
}
