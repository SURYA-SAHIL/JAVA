interface Payment {
    void pay();
}

class Cash implements Payment {
    public void pay() {
        System.out.println("PAY BY CASH");
    }

    public static void main(String[] args) {
        Payment p = new Cash();
        p.pay();
    }
}
