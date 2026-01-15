import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);

        System.out.println("Bank Account Menu");
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");

        int choice;
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
