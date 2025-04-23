
import java.util.Scanner;

abstract class BankAcc {

    public abstract void deposit();

    public abstract void withdraw();
}

class SavingsAcc extends BankAcc {

    int money = 100000;
    int d, w;

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        d = sc.nextInt();
        if (d > 0) {
            money += d;
            System.out.println("Amount deposited.");
            System.out.println("Balance amount in account: " + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        w = sc.nextInt();

        if (w > 0 && w < money) {
            money -= w;
            System.out.println("Amount withdrawed.");
            System.out.println("Balance amount in account: " + money);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class CurrentAcc extends BankAcc {

    int money = 5000000;
    int d, w;

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        d = sc.nextInt();
        if (d > 0) {
            money += d;
            System.out.println("Amount deposited.");
            System.out.println("Balance amount in account: " + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        w = sc.nextInt();

        if (w > 0 && w < money) {
            money -= w;
            System.out.println("Amount withdrawed.");
            System.out.println("Balance amount in account: " + money);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Abstract_bank_acc {

    public static void main(String args[]) {
        SavingsAcc s = new SavingsAcc();
        CurrentAcc c = new CurrentAcc();
        System.out.println("Savings Account:");
        s.deposit();
        s.withdraw();
        System.out.println("Current Acoount:");
        c.deposit();
        c.withdraw();
    }
}
