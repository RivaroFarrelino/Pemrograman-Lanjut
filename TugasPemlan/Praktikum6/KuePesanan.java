package TugasPemlan.Praktikum6;

public class KuePesanan extends Kue{
    private double berat;

    KuePesanan(double berat, String nama, double harga){
        super(nama, harga);
        this.berat = berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungHarga(){
        return getHarga() * this.berat;
    }
}
 