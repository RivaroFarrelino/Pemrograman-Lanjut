package TugasPemlan.Praktikum7;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Perfume", 2, 20);
        Invoice invoice2 = new Invoice("Airpods", 1, 200);
        Invoice invoice3 = new Invoice("Electric Board", 1, 650);
        Invoice[] invoices1 = {invoice1, invoice2, invoice3};

        Employee employee1 = new Employee(14045, "Roberto Firmino", 7000, invoices1);
        employee1.display();

        Invoice invoice4 = new Invoice("Shoes", 1, 120);
        Invoice invoice5 = new Invoice("Corkcicle", 1, 79);
        Invoice[] invoices2 = {invoice4, invoice5};

        Employee employee2 = new Employee(22038, "Kiernan Dewsbury-Hall", 9000, invoices2);
        employee2.display();
    }
}
