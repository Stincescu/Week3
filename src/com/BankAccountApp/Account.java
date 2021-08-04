package com.BankAccountApp;

public class Account {
    private double accountSum = 2500;

    void withdrawFromAccount(double withdrawAmount){
        if(withdrawAmount > accountSum){
            System.out.println("You can not withdraw such a big amount");
        }
        else{
            accountSum = accountSum - withdrawAmount;
            System.out.println("You have just withdrawn " + withdrawAmount + " euro");
            System.out.println("Account balance: " + accountSum);
        }
    }

    void makeDeposit(double depositAmount) {
        accountSum = accountSum + depositAmount;
        System.out.println("You have just made a deposit of: " + depositAmount);
        System.out.println("Account balance: " + accountSum);
    }

    void chooseOption(Option option, double amount){

        switch(option){
            case withdraw:
                System.out.println("You have chosen to make a withdraw");
                withdrawFromAccount(amount);
                break;
            case deposit:
                System.out.println("You have chosen to make a deposit");
                makeDeposit(amount);
                break;
            default:
                System.out.println("Wrong option, you can choose from: withdraw and deposit");
                break;
        }

    }

}
