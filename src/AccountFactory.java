public class AccountFactory {

    BankAccount getAccountType(String accountType) {
        if (accountType == null) {
            return null;

        } else if (accountType.equalsIgnoreCase("SavingsAccount")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("ChequeAccount")) {
            return new ChequeAccount();
        }
        return null;

    }
}
