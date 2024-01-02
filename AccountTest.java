public class AccountTest {
    private String accountNumber;
    private double balance;

    public AccountTest(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    private void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        AccountTest myAccount = new AccountTest("12345", 1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.printAccountDetails();
    }

}
