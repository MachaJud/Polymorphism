import java.util.Scanner;

public class Transaction {
    private double okoaJahaziDebt;
    private double balance;

    public Transaction(double okoaJahaziDebt, double balance) {
        this.okoaJahaziDebt = okoaJahaziDebt;
        this.balance = balance;
    }

    public void transaction(double topUpAmount) {
        balance += topUpAmount;
    }

    public void transaction() {
        if (okoaJahaziDebt > 0) {
            double remainingBalance = balance - okoaJahaziDebt;
            if (remainingBalance >= 0) {
                balance = remainingBalance;
                okoaJahaziDebt = 0;
                System.out.println("Okoa Jahazi debt has been deducted. Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient balance to deduct Okoa Jahazi debt.");
            }
        } else {
            System.out.println("No Okoa Jahazi debt to deduct.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your existing Okoa Jahazi debt: $");
        double existingDebt = scanner.nextDouble();

        System.out.print("Enter the amount you want to top up as credit: $");
        double topUpAmount = scanner.nextDouble();

        System.out.print("Enter your current balance: $");
        double currentBalance = scanner.nextDouble();

        Transaction transaction = new Transaction(existingDebt, currentBalance);

        // Deduct the Okoa Jahazi debt
        transaction.transaction();

        // Top up credit
        transaction.transaction(topUpAmount);

        System.out.println("Updated balance: $" + transaction.getBalance());

        scanner.close();
    }
}
