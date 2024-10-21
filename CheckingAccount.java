public class CheckingAccount extends BankAccount {
    private double interestRate;

    void processWithdrawal() {
        double res = getBalance() - 30.0;
        System.out.println("Balance: " + res);
        System.out.println("$30 fee has been accessed.");
    }

    public CheckingAccount() {
        interestRate = 3.5;
    }

    void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}