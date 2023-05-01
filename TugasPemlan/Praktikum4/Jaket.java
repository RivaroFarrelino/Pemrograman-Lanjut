package TugasPemlan.Praktikum4;

public class Jaket {
    private static final double hargaJaket_A = 100_000;
    private static final double hargaJaket_B = 125_000;
    private static final double hargaJaket_C = 175_000;
    private static int banyakJaket_A;
    private static int banyakJaket_B;
    private static int banyakJaket_C;

    public static void addJaket_A(int banyakJaket){
        banyakJaket_A += banyakJaket;
    }

    public static void addJaket_B(int banyakJaket){
        banyakJaket_B += banyakJaket;
    }
    
    public static void addJaket_C(int banyakJaket){
        banyakJaket_C += banyakJaket;
    }

    static double getTotalHarga(){
        double totalHargaJaket_A = banyakJaket_A > 100 ? banyakJaket_A * 95_000 : banyakJaket_A * hargaJaket_A;
        double totalHargaJaket_B = banyakJaket_B > 100 ? banyakJaket_B * 120_000 : banyakJaket_B * hargaJaket_B;
        double totalHargaJaket_C = banyakJaket_C > 100 ? banyakJaket_C * 160_000 : banyakJaket_C * hargaJaket_C;

        return totalHargaJaket_A + totalHargaJaket_B + totalHargaJaket_C;
    }

    static void display(){
        System.out.println("Qty\t\tBarang\t\tHarga Satuan\tJumlah");
        System.out.printf("%d\t\tJaket A\t\tRp. %.0f\tRp. %.0f\n", banyakJaket_A, banyakJaket_A > 100 ? hargaJaket_A - 5000 : hargaJaket_A, banyakJaket_A > 100 ? banyakJaket_A * 95_000 : banyakJaket_A * hargaJaket_A);
        System.out.printf("%d\t\tJaket B\t\tRp. %.0f\tRp. %.0f\n", banyakJaket_B, banyakJaket_B > 100 ? hargaJaket_B - 5000 : hargaJaket_B, banyakJaket_B > 100 ? banyakJaket_B * 120_000 : banyakJaket_B * hargaJaket_B);
        System.out.printf("%d\t\tJaket C\t\tRp. %.0f\tRp. %.0f\n", banyakJaket_C, banyakJaket_C > 100 ? hargaJaket_C - 15000 : hargaJaket_C, banyakJaket_C > 100 ? banyakJaket_C * 160_000 : banyakJaket_C * hargaJaket_C);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Total harga\t: Rp. %.0f", getTotalHarga());
    }
}
