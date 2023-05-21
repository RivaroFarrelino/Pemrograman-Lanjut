package TugasPemlan.Praktikum7;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount(){
        double totalInvoicesAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoicesAmount += invoice.getPayableAmount();
        }
        return this.salaryPerMonth - totalInvoicesAmount;
    }

    public void display(){
        System.out.println("Employee name\t\t: " + this.name);
        System.out.println("Registration number\t: " + this.registrationNumber);
        System.out.println("Monthly salary\t\t: " + this.salaryPerMonth);
        System.out.println("--------------------Invoice--------------------");
        System.out.println("Product name\t\tQuantity\tPrice per item\t\tSubtotal per item");
        for(Invoice e : getInvoices()){
            System.out.printf("\n%10s\t\t%5d\t\t%8d\t\t%10d", e.getProductName(), e.getQuantity(), e.getPricePerItem(), e.getQuantity() * e.getPricePerItem());
        }
        System.out.println("\n----------------------------------------");
        System.out.printf("\nAfter the pay cut\t: %.0f", this.getPayableAmount());
    }
}
