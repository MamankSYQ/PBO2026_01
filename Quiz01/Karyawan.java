package Quiz01;
import java.util.ArrayList;
import java.util.List;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String posisi;
    private List<Kendaraan> kendaraanDitangani;
    
    public Karyawan(String idKaryawan, String nama, String posisi) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.posisi = posisi;
        this.kendaraanDitangani = new ArrayList<>();
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }
 
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getPosisi() {
        return posisi;
    }
 
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
 
    public List<Kendaraan> getKendaraanDitangani() {
        return kendaraanDitangani;
    }

    public void tanganiKendaraan(Kendaraan kendaraan) {
        kendaraanDitangani.add(kendaraan);
        kendaraan.setMekanikPenanggungJawab(this);
    }

    public void tambahkanLayananUntukKendaraan(Kendaraan kendaraan, Layanan layanan) {
        kendaraan.tambahLayanan(layanan);
    }
}
