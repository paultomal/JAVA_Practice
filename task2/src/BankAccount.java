public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public  BankAccount(int accountNumber, double balance, String accountHolder){
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int setAccountNumber(int accountNumber) {
        return this.accountNumber = accountNumber;

    }

    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public String setAccountHolder(String accountHolder) {
        return this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.printf("Deposit " +amount+ " Successful");

    }
    public void withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;

        System.out.println("Withdrawal "+amount+ " Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
