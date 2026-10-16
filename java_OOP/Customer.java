public class Customer {
    private String name;
    private double debt;
    private String phone;

    // constructor
    public Customer(String name, double debt, String phone) {
        this.name = name;
        this.debt = debt;
    }

    public double addDebt(double amount) {
        this.debt++;
    }

    public double payDebt(double amount) {
        this.debt--;
    }

    @Override
    public String toString() {
        return "Customer: this.name, Debt: $this.debt, Phone: 555-0192";
    }

    public class PremiumCustomer extends Customer {
        private double creditLimit;

        public PremiumCustomer(String name, double debt, double creditLimit) {
            super(name, debt); // Calls the parent constructor
            this.creditLimit = creditLimit;
        }
    }

}