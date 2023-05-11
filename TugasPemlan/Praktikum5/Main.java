package TugasPemlan.Praktikum5;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("A", "123", true, true);
        System.out.println(manusia1);

        Manusia manusia2 = new Manusia("B", "456", false, true);
        System.out.println(manusia2);

        Manusia manusia3 = new Manusia("C", "789", true, false);
        System.out.println(manusia3);

        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("225150707111076", 4, "Muhammad Rivaro Farrelino Gozali", "3175073006", true, false);
        System.out.println(mahasiswaFILKOM1);
        
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("225150707111076", 3.7, "Muhammad Rivaro Farrelino Gozali", "3175073006", true, false);
        System.out.println(mahasiswaFILKOM2);
        
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("225150707111076", 2.8, "Muhammad Rivaro Farrelino Gozali", "3175073006", true, false);
        System.out.println(mahasiswaFILKOM3);

        Pekerja pekerja1 = new Pekerja(5000, 2021, 5, 10, 2, "D", "34567", true, true);
        System.out.println(pekerja1);
        
        Pekerja pekerja2 = new Pekerja(6000, 2014, 5, 10, 0, "E", "31892", false, false);
        System.out.println(pekerja2);

        Pekerja pekerja3 = new Pekerja(6200, 2003, 5, 10, 10, "F", "85212", true, true);
        System.out.println(pekerja3);

        Manager manager1 = new Manager("HRD", 7500, 2008, 5, 10, 0, "G", "678910", true, false);
        System.out.println(manager1);
    }
}
