package TugasPemlan.BangunDatar;

import java.util.Scanner;

public class BangunDatara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======LINGKARAN=======");
        System.out.print("Input jari-jari: ");
        int jariJari = input.nextInt();
        
        System.out.println("Luas lingkaran adalah: " + luasLingkaran(jariJari));
        
        System.out.println("=======SEGIEMPAT=======");
        System.out.print("Input sisi 1: ");
        int sisi1 = input.nextInt();
        System.out.print("Input sisi 2: ");
        int sisi2 = input.nextInt();

        System.out.println("Keliling segiempat adalah: " + kelilingSegiEmpat(sisi1, sisi2));
        
        System.out.println("Luas segiempat adalah: " + luasSegiEmpat(sisi1, sisi2));

        System.out.println("Panjang diagonal segiempat adalah: " + panjangDiagonalSisiEmpat(sisi1, sisi2));

        input.close();

    }

    public static double luasLingkaran(int jariJari){
        return Math.PI * jariJari * jariJari;
    }

    public static double kelilingSegiEmpat(int sisi1, int sisi2){
        int keliling = 2 * (sisi1 + sisi2);
        return keliling;
    }

    public static double luasSegiEmpat(int sisi1, int sisi2){
        int luas = sisi1 * sisi2;
        return luas;
    }

    public static double panjangDiagonalSisiEmpat(int sisi1, int sisi2){
        double diagonalSegiEmpat = Math.sqrt(Math.pow(sisi1, 2) + (Math.pow(sisi2, 2)));
        return diagonalSegiEmpat;
    }
}
