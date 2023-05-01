package TugasPemlan.Praktikum4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Beli berapa jaket A?");
        int banyakJaket_A = input.nextInt();
        
        System.out.println("Beli berapa jaket B?");
        int banyakJaket_B = input.nextInt();
        
        System.out.println("Beli berapa jaket C?");
        int banyakJaket_C = input.nextInt();

        Jaket.addJaket_A(banyakJaket_A);
        Jaket.addJaket_B(banyakJaket_B);
        Jaket.addJaket_C(banyakJaket_C);

        Jaket.display();

        input.close();
    }
}
