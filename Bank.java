class Bank {
    private int balance = 1000;

    void deposit(int amt) {
        balance += amt;
    }

    void showBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        b.showBalance();
    }
}
