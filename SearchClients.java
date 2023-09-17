package com.example.AssetAlign-Financial.Admin;

public class clientSearch {
    String Account_number, First_name, Last_name;

    public clientSearch ( String Account_number,String First_name,String Last_name){
        this.Account_number = Account_number;
        this.First_name = First_name;
        this.Last_name =Last_name;
    }

    public String getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(String account_number) {
        Account_number = account_number;
    }
        public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }
}


