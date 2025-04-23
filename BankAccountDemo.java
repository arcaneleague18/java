import java.util.Scanner;

abstract class BankAccount {
    protected double balance;
    
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f to Savings Account. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount: Must be positive");
        }
    }
    
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f from Savings Account. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid withdrawal: Insufficient funds or invalid amount");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    
    CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f to Current Account. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount: Must be positive");
        }
    }
    
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f from Current Account. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid withdrawal: Exceeds overdraft limit or invalid amount");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance = scanner.nextDouble();
        if (savingsBalance < 0) {
            System.out.println("Invalid balance: Must be non-negative");
            return;
        }
        
        SavingsAccount savings = new SavingsAccount(savingsBalance);
        System.out.print("Enter amount to deposit to Savings: ");
        double deposit = scanner.nextDouble();
        savings.deposit(deposit);
        System.out.print("Enter amount to withdraw from Savings: ");
        double withdraw = scanner.nextDouble();
        savings.withdraw(withdraw);
        
        System.out.print("\nEnter initial balance for Current Account: ");
        double currentBalance = scanner.nextDouble();
        System.out.print("Enter overdraft limit for Current Account: ");
        double overdraftLimit = scanner.nextDouble();
        if (currentBalance < 0 || overdraftLimit < 0) {
            System.out.println("Invalid balance or overdraft limit: Must be non-negative");
            return;
        }
        
        CurrentAccount current = new CurrentAccount(currentBalance, overdraftLimit);
        System.out.print("Enter amount to deposit to Current: ");
        deposit = scanner.nextDouble();
        current.deposit(deposit);
        System.out.print("Enter amount to withdraw from Current: ");
        withdraw = scanner.nextDouble();
        current.withdraw(withdraw);
        
        
    }
}