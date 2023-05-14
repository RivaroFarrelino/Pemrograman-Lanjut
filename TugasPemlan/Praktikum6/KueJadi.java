package TugasPemlan.Praktikum6;

public class KueJadi extends Kue{
    private double jumlah;

    KueJadi(double jumlah, String nama, double harga){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungHarga(){
        return super.getHarga() * this.jumlah * 2;
    }
}
