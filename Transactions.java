package com.example.demo.Admin;

import javafx.beans.property.SimpleStringProperty;

public class TransactionView {

    private final SimpleStringProperty Transaction_number, Account_number, Date_Created, income_date, income_deposit, income_amount, expense_date, expense_supplier, expense_amount;

       public  TransactionView (String Transaction_Number ,String Account_Number,String  Date_created,String  income_date,String  income_deposit,String  income_amount,
                     String expense_date,String  expense_supplier,String  expense_amount){
        this.Transaction_number = new SimpleStringProperty(Transaction_Number);
        this.Account_number =new SimpleStringProperty(Account_Number);
        this.Date_Created =new SimpleStringProperty(Date_created);
        this.income_date =new SimpleStringProperty(income_date);
        this.income_deposit =new SimpleStringProperty(income_deposit);
        this.income_amount =new SimpleStringProperty(income_amount);
        this.expense_date =new SimpleStringProperty(expense_date);
        this.expense_supplier =new SimpleStringProperty(expense_supplier);
        this.expense_amount =new SimpleStringProperty(expense_amount);

    }

    public String getTransaction_number() {
        return Transaction_number.get();
    }

    public void setTransaction_number(String Transaction_Number) {
        this.Transaction_number.set(Transaction_Number);
    }




