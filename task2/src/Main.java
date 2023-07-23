public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1, 2000.00, "Paul");
        System.out.println(a1.getAccountNumber());
        System.out.println(a1.getAccountHolder());
        System.out.println(a1.getBalance());


        a1.deposit(500.0);
        System.out.println("\nNew Balance: " + a1.getBalance());

        a1.withdraw(200.0);
        System.out.println("\nNew Balance: " + a1.getBalance());

        a1.withdraw(1500.0); // Attempt to withdraw more than the balance
        System.out.println("\nNew Balance: " + a1.getBalance());

    }
}