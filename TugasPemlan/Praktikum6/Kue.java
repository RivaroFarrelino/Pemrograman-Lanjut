package TugasPemlan.Praktikum6;

public abstract class Kue {
    private String nama;
    private double harga;

    Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString(){
        return String.format("Nama kue\t\t: %s\nHarga satuan\t\t: Rp. %.0f\nHarga total\t\t: Rp. %.0f", this.nama, this.harga, hitungHarga());
    }
}
