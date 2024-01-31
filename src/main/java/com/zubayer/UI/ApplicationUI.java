package com.zubayer.UI;

import java.util.Scanner;

/**
 *
 * @author Md. Zubayer Islam
 */
public class ApplicationUI {
    
    public String[] MAIN_MENU = {
        "Create a new account",
        "Display all account",
        "Update an account",
        "Delete an account",
        "Deposit an amount",
        "Withdraw an amount",
        "Search",
        "Exit"
    };
    
    public String[] ACCOUNT_TYPE_MENU = {
        "Current Account",
        "Savings Account",
        "Salary Account",
        "Business Account",
        "Back"
    };
    
    public void welcome(){
        System.out.println("--------------------------------------------");
        System.out.println("|        Welcome to Banking App            |");
        System.out.println("--------------------------------------------\n");
    }
    
    public void printSeparator(){
        System.out.println("--------------------------------------------\n");
    }
    
    public int ShowMenu(String[] menu){
        printSeparator();
        for(int i=0; i<menu.length; i++){
            System.out.println((i+1) + ". " + menu[i] + "\n");
        }
        System.out.println("Choose your option: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            choice = sc.nextInt();
            if(choice < 1 || choice> menu.length){
                System.out.println("Invalid option!, Please try again: ");
            }
        } while (choice <1 || choice> menu.length);
        return choice;
    }
}
