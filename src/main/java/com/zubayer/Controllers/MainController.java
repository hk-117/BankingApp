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
    
    public static void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added.");
    }
    
    public static void displayAccounts(){
        System.out.println("\t Account Number \t Name \n");
        for(Account ac: accounts){
            System.out.println("\t" + ac.getAccNumber() + "\t" + ac.getName());
        }
    }
    
    public static int searchAccount(int accountNumber){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getAccNumber() == accountNumber){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean deleteAccount(int accountNumber){
        int searchResult = searchAccount(accountNumber);
        if(searchResult == -1){
            return false;
        }
        accounts.remove(searchResult);
        return true;
    }
    
}
