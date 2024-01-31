package com.zubayer.bankingapp;
/**
 *
 * @author Md. Zubayer Islam
 */

import com.zubayer.Controllers.*;
import com.zubayer.Entities.*;
import java.util.*;
import com.zubayer.UI.ApplicationUI;

public class BankingApp {

    public static void main(String[] args) {
        
        ApplicationUI ui = new ApplicationUI();
        MainController controller = MainController.getMainController();
        AccountFactory factory = new AccountFactory();
        Scanner sc = new Scanner(System.in);
        
        ui.welcome();
        int choice;
        do{
            choice = ui.ShowMenu(ui.MAIN_MENU);
            switch(choice){
                case 1:
                    ui.printSeparator();
                    System.out.println("Creating an account");
                    ui.printSeparator();
                    System.out.println("Enter account holder name: ");
                    sc.next();
                    String name = sc.nextLine();
                    System.out.println("Enter initial deposit: ");
                    double initBalance = sc.nextDouble();
                    int c ;
                    do{
                        c = ui.ShowMenu(ui.ACCOUNT_TYPE_MENU);
                        Account ac = null;
                        switch(c){
                            case 1:
                                ac = factory.makeAccount(
                                        name, 
                                        controller.getNewAccountNumber(),
                                        new GregorianCalendar(), 
                                        initBalance, 
                                        "Current"
                                );
                                break;
                                
                            case 2:
                                ac = factory.makeAccount(
                                        name, 
                                        controller.getNewAccountNumber(),
                                        new GregorianCalendar(), 
                                        initBalance, 
                                        "Savings"
                                );
                                break;
                                
                            case 3:
                                ac = factory.makeAccount(
                                        name, 
                                        controller.getNewAccountNumber(),
                                        new GregorianCalendar(), 
                                        initBalance, 
                                        "Salary"
                                );
                                break;
                                
                            case 4:
                                ac = factory.makeAccount(
                                        name, 
                                        controller.getNewAccountNumber(),
                                        new GregorianCalendar(), 
                                        initBalance, 
                                        "Business"
                                );
                                break;
                                
                            default:
                                break;
                        }
                        if(ac != null){
                            controller.addAccount(ac);
                            c = 5;
                        } else {
                            break;
                        }
                    } while(c != 5);
                    
                    break;
                    
                case 2:
                    ui.printSeparator();
                    System.out.println("Displaying all account");
                    ui.printSeparator();
                    controller.displayAccounts();
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
