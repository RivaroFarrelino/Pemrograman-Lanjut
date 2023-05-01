package TugasPemlan.BangunDatar;

import java.util.Scanner;

class Lingkaran{
    double jariJari;

    double hitungLuas(double jariJari){
        return Math.PI * jariJari * jariJari;
    }
}

class Segiempat{
    int sisi1;
    int sisi2;

    //keliling
    int hitungKeliling(int sisi1, int sisi2){
        return 2 * (sisi1 + sisi2);
    }

    //luas
    int hitungLuas(int sisi1, int sisi2){
        return sisi1 * sisi2;
    }

    //panjang diagonal
    double hitungPanjangDiagonal(int sisi1, int sisi2){
        return Math.sqrt(Math.pow(sisi1, 2) + Math.pow(sisi2, 2));
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lingkaran lingkaran1 = new Lingkaran();
        Segiempat segiempat1 = new Segiempat();

        System.out.println("1. Lingkaran");
        System.out.println("2. Segiempat");
        System.out.print("Pilih aja: ");
        byte pilih = input.nextByte();

        if(pilih == 1){
            System.out.println("\n=======Menghitung luas lingkaran=======");
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = input.nextDouble();
            
            System.out.print("Luas lingkaran = " + lingkaran1.hitungLuas(jariJari));
            lingkaran1.hitungLuas(jariJari);
        } 
        
        else if(pilih == 2){
            System.out.println("\n=======Menghitung keliling, luas, dan panjang diagonal segiempat=======");
            System.out.print("Masukkan sisi pertama: ");
            int sisi1 = input.nextInt();
            System.out.print("Masukkan sisi kedua: ");
            int sisi2 = input.nextInt();

            System.out.println("Keliling         = " + segiempat1.hitungKeliling(sisi1, sisi2));
            System.out.println("Luas             = " + segiempat1.hitungLuas(sisi1, sisi2));
            System.out.println("Panjang diagonal = " + segiempat1.hitungPanjangDiagonal(sisi1, sisi2));
        }

        else{
            System.out.println("Gak ada pilihannya");
            System.exit(0);
        }
        input.close();
    }
}

