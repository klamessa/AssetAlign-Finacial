package com.example.demo.Admin;

import javafx.beans.property.SimpleStringProperty;

public class SavingsView {

    private final SimpleStringProperty Savings_account_number, Account_number, account_balance;

    public SavingsView(String saving_acc_number, String acc_number, String acc_bal) {

        this.Savings_account_number =new SimpleStringProperty(saving_acc_number);
        this.Account_number =new SimpleStringProperty(acc_number);
        this.account_balance =new SimpleStringProperty(acc_bal);

}
