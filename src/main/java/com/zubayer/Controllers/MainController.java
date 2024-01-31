package com.zubayer.Controllers;

import com.zubayer.Entities.Account;
import java.util.ArrayList;


/**
 *
 * @author Md. Zubayer Islam
 */
public class MainController {
    private static final ArrayList <Account> accounts = new ArrayList<>();
    private static MainController controller;
    private static int accNumber = 0;
    
    /*
        Only Single instance is needed of this controller
    */
    private MainController(){
        
    }
    
    public static MainController getMainController(){
        if(controller == null){
            controller = new MainController();
        }
        return controller;
    }
    
    public int getNewAccountNumber(){
        return ++accNumber;
    }
    
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account Created Successfully.");
    }
    
    public void displayAccounts(){
        System.out.println("Account Number \t Name \t\t Type \n");
        for(Account ac: accounts){
            System.out.println("\t" + ac.getAccNumber() + "\t" + ac.getName() + "\t\t" + ac.getClass().getSimpleName());
        }
    }
    
    public Account searchAccount(int accountNumber){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getAccNumber() == accountNumber){
                return accounts.get(i);
            }
        }
        return null;
    }
    
    public boolean deleteAccount(int accountNumber){
        Account searchResult = searchAccount(accountNumber);
        if(searchResult == null){
            return false;
        }
        accounts.remove(searchResult);
        return true;
    }
    
}
