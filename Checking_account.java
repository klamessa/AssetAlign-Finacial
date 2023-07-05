public class Checking_account {
    private final SimpleStringProperty Checking_account_number, Account_number, account_balance;

    public Checking_account(String checking_acc_number, String account_number, String account_bal) {
        this.Checking_account_number =new SimpleStringProperty(checking_acc_number);
        this.Account_number =new SimpleStringProperty(account_number);
        this.account_balance =new SimpleStringProperty(account_bal);
    
    }

    public String getChecking_account_number() {
        return Checking_account_number.get();
    }

    public void setChecking_account_number(String checking_acc_number){
        this.Checking_account_number.set(checking_acc_number);
    }

    public String getAccount_balance(){
        return account_balance.get();
    }
}
