public class Main {
    public static void main(String[] args) {
    AccountFactory accountFactory =  new AccountFactory();

        BankAccount savings = accountFactory.getAccountType("SavingsAccount");
        savings.create();
         BankAccount cheque = accountFactory.getAccountType("ChequeAccount");
        cheque.create();



    }
}
