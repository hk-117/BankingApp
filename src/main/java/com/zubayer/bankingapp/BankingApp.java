package com.zubayer.bankingapp;
/**
 *
 * @author Md. Zubayer Islam
 */

import com.zubayer.Controllers.MainController;
import com.zubayer.UI.ApplicationUI;

public class BankingApp {

    public static void main(String[] args) {
        ApplicationUI ui = new ApplicationUI();
        ui.welcome();
        int choice;
        do{
            choice = ui.ShowMenu(ui.MAIN_MENU);
            switch(choice){
                case 1:
                    ui.printSeparator();
                    System.out.println("Creating an account");
                    ui.printSeparator();
                    break;
                case 2:
                    ui.printSeparator();
                    System.out.println("Displaying all account");
                    ui.printSeparator();
                    break;
                case 3:
                    ui.printSeparator();
                    System.out.println("Updating an account");
                    ui.printSeparator();
                    break;
                case 4:
                    ui.printSeparator();
                    System.out.println("Deleting an account");
                    ui.printSeparator();
                    break;
                case 5:
                    ui.printSeparator();
                    System.out.println("Depositing an amount");
                    ui.printSeparator();
                    break;
                case 6:
                    ui.printSeparator();
                    System.out.println("Withdraing an amount");
                    ui.printSeparator();
                    break;
                case 7:
                    ui.printSeparator();
                    System.out.println("Searching an account");
                    ui.printSeparator();
                    break;
                default:
                    break;
            }
        } while(choice != 8);
    }
}
