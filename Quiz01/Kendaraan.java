package Quiz01;
import java.util.ArrayList;
import java.util.List;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;
    private Pelanggan pemilik;
    private Karyawan mekanikPenanggungJawab;
    private List<Layanan> layananDipilih;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
        this.layananDipilih = new ArrayList<>();
    }

    public String getPlatNomor() {
        return platNomor;
    }
 
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
 
    public String getMerek() {
        return merek;
    }
 
    public void setMerek(String merek) {
        this.merek = merek;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public String getTipeKendaraan() {
        return tipeKendaraan;
    }
 
    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }
 
    public Pelanggan getPemilik() {
        return pemilik;
    }
 
    public void setPemilik(Pelanggan pemilik) {
        this.pemilik = pemilik;
    }
 
    public Karyawan getMekanikPenanggungJawab() {
        return mekanikPenanggungJawab;
    }
 
    public void setMekanikPenanggungJawab(Karyawan mekanikPenanggungJawab) {
        this.mekanikPenanggungJawab = mekanikPenanggungJawab;
    }
 
    public List<Layanan> getLayananDipilih() {
        return layananDipilih;
    }
 
    public void tambahLayanan(Layanan layanan) {
        layananDipilih.add(layanan);
    }

    public double getBiayaLayananDasar() {
        if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
            return 50000.0;
        } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
            return 20000.0;
        } else {
            return 0.0;
        }
    }

    public double hitungTotalBiaya() {
        double total = getBiayaLayananDasar();
        for (Layanan layanan : layananDipilih) {
            total += layanan.getServicePrice();
        }
        return total;
    }

    public String getInfoKendaraan() {
        return tipeKendaraan + " - " + merek + " " + model + " (Plat: " + platNomor + ")";
    }
}
