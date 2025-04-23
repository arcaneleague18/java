abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    double balance = 1000;
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: Deposited " + amount + ", New Balance: " + balance);
    }
    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings: Withdrawn " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Savings: Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {
    double balance = 2000;
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current: Deposited " + amount + ", New Balance: " + balance);
    }
    
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Current: Withdrawn " + amount + ", New Balance: " + balance);
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();
        
        savings.deposit(500);
        savings.withdraw(200);
        current.deposit(1000);
        current.withdraw(2500);
    }
}