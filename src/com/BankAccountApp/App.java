package com.BankAccountApp;

public class App {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.chooseOption(Option.withdraw, 1500);
        account1.chooseOption(Option.deposit, 1500);
        account1.chooseOption(Option.withdraw, 2500);
        account1.chooseOption(Option.withdraw, 2);

    }
}
