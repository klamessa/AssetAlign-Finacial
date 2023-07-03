public class CheckingView {
    private final SimpleStringProperty Checking_account_number, Account_number, account_balance;

    public CheckingView(String checking_acc_number, String account_number, String account_bal) {
        this.Checking_account_number =new SimpleStringProperty(checking_acc_number);
        this.Account_number =new SimpleStringProperty(account_number);
        this.account_balance =new SimpleStringProperty(account_bal);
    
    }
}
