package TugasPemlan.Praktikum6;

public class Main {
    public static void main(String[] args) {
        Kue[] listKue = new Kue[20];

        listKue[0] = new KueJadi(3, "Risol", 2500);
        listKue[1] = new KueJadi(2, "Lemper", 2000);
        listKue[2] = new KueJadi(4, "Croissant", 11000);
        listKue[3] = new KueJadi(6, "Lumpur", 6000);
        listKue[4] = new KueJadi(1, "Cucur", 2000);
        listKue[5] = new KueJadi(3, "Putu", 1000);
        listKue[6] = new KueJadi(3, "Klepon", 1000);
        listKue[7] = new KueJadi(7, "Serabi", 2000);
        listKue[8] = new KueJadi(10, "Onde-onde", 1500);
        listKue[9] = new KueJadi(6, "Donat", 6500);
        listKue[10] = new KuePesanan(1, "Putri salju", 45_000);
        listKue[11] = new KuePesanan(0.9, "Nastar", 30_000);
        listKue[12] = new KuePesanan(1.4, "Kacang tanah", 36_000);
        listKue[13] = new KuePesanan(1.3, "Castengel", 47_000);
        listKue[14] = new KuePesanan(2, "Sagu", 25_000);
        listKue[15] = new KuePesanan(0.5, "Tiramisu", 80_000);
        listKue[16] = new KuePesanan(0.4, "Pavlova", 60_000);
        listKue[17] = new KuePesanan(0.7, "Apple pie", 21_000);
        listKue[18] = new KuePesanan(2.1, "Cinnamon roll", 32_000);
        listKue[19] = new KuePesanan(1.34, "Cheesecake brownies", 76_000);

        for(Kue kue : listKue){
            System.out.println(kue.toString());
            if(kue instanceof KuePesanan){
                System.out.println("Jenis kue\t\t: kue pesanan");
            } else{
                System.out.println("Jenis kue\t\t: kue jadi");
            }
            System.out.println();
        }

        //Total harga semua jenis kue
        System.out.println("-------Total harga semua jenis kue-------");
        double totalHarga = 0;
        for (Kue kue : listKue) {
            totalHarga += kue.hitungHarga();
        }
        System.out.printf("Total harga\t\t: Rp. %.0f", totalHarga);

        //total harga dan total berat dari KuePesanan
        System.out.println("\n\n-------total harga dan total berat dari KuePesanan-------");
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : listKue) {
            if(kue instanceof KuePesanan){
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.printf("Total harga kue pesanan\t: Rp. %.0f", totalHargaKuePesanan);
        System.out.printf("\nTotal berat kue pesanan\t: %.2f kg", totalBeratKuePesanan);

        //total harga dan total jumlah dari KueJadi
        System.out.println("\n\n-------total harga dan total jumlah dari KueJadi-------");
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : listKue) {
            if(kue instanceof KueJadi){
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.printf("Total harga kue jadi\t: Rp. %.0f", totalHargaKueJadi);
        System.out.printf("\nTotal jumlah kue jadi\t: %.0f", totalJumlahKueJadi);

        //Informasi kue dengan harga terbesar
        System.out.println("\n\n-------Kue dengan harga terbesar-------");
        double hargaKueTermahal = 0;
        Kue kueTermahal = null;
        for (Kue kue : listKue) {
            if(hargaKueTermahal < kue.hitungHarga()){
                hargaKueTermahal = kue.hitungHarga();
                kueTermahal = kue;
            }
        }
        if(kueTermahal != null){
            System.out.println("Kue dengan harga terbesar adalah: ");
            System.out.println(kueTermahal.toString());
        }
    }
}
