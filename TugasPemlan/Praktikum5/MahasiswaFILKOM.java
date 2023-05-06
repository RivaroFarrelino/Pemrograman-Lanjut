package TugasPemlan.Praktikum5;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus(){
        String angkatan = this.nim.substring(0, 2);
        char prodi = this.nim.charAt(6);

        switch(prodi){
            case '2': return "Teknik Informatika, 20" + angkatan;
            case '3': return "Teknik Komputer, 20" + angkatan;
            case '4': return "Sistem Informasi, 20" + angkatan;
            case '6': return "Pendidikan Teknologi Informasi, 20" + angkatan;
            case '7': return "Teknologi Informasi, 20" + angkatan;
        }

        return "";
    }

    public double getBeasiswa(){
        if(this.ipk >= 3 && this.ipk <= 3.5){
            return 50 + getPendapatan();
        } else if(this.ipk > 3.5 && this.ipk <= 4){
            return 75 + getPendapatan();
        } else{
            return 0;
        }
    }

    public String toString(){
        return(
            "\nnama\t\t: " + getNama()
            + "\nnik\t\t: " + getNik()
            + "\njenisKelamin\t: " + getJenisKelamin()
            + "\npendapatan\t: " + getBeasiswa()
            + "\nnim\t\t: " + getNim()
            + "\nipk\t\t: " + getIpk()
            + "\nstatus\t\t: " + getStatus()
        );
    }


}
