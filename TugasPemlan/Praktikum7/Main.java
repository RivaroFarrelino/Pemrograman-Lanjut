package TugasPemlan.Praktikum7;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Perfume", 2, 20);
        Invoice invoice2 = new Invoice("Airpods", 1, 200);
        Invoice invoice3 = new Invoice("Electric Board", 1, 650);
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        Employee employee1 = new Employee(14045, "Firmino", 7000, invoices);
        employee1.display();
    }
}
