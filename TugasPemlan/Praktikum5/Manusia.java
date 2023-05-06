package TugasPemlan.Praktikum5;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin == true ? ("Laki-laki") : "Perempuan";
    }

    public String getNik() {
        return nik;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (getMenikah()) {
            if (jenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString() {
        return ("\nnama\t\t: " + this.nama
                + "\nnik\t\t: " + this.nik
                + "\njenisKelamin\t: " + this.getJenisKelamin()
                + "\npendapatan\t: " + getPendapatan());
    }
}