package Quiz01;
public class BengkelMain {
    public static void main(String[] args) {
        // 1. Membuat objek Layanan
        Layanan gantiOli = new Layanan("Ganti Oli", 100000);
        Layanan tuneUp = new Layanan("Tune Up", 150000);
        Layanan servisRem = new Layanan("Servis Rem", 75000);
        Layanan gantiBan = new Layanan("Ganti Ban", 300000);
 
        // 2. Membuat objek Karyawan
        Karyawan budi = new Karyawan("K001", "Budi Santoso", "Mekanik Senior");
        Karyawan andi = new Karyawan("K002", "Andi Wijaya", "Mekanik");
 
        // 3. Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Siti Aminah", "081234567890");
        Pelanggan pelanggan2 = new Pelanggan("Joko Prasetyo", "089876543210");
 
        // 4. Membuat objek Kendaraan (2 mobil dan 2 sepeda motor)
        Kendaraan mobil1 = new Kendaraan("B1234ABC", "Toyota", "Avanza", "Mobil");
        Kendaraan mobil2 = new Kendaraan("D5678XYZ", "Honda", "Brio", "Mobil");
        Kendaraan motor1 = new Kendaraan("B111RST", "Yamaha", "NMAX", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("D222UVW", "Honda", "Vario", "Sepeda Motor");
 
        // 5. Menghubungkan kendaraan dengan pemiliknya (Pelanggan)
        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan2.tambahKendaraan(mobil2);
        pelanggan2.tambahKendaraan(motor2);
 
        // 6. Menguhubungkan kendaraan dengan Karyawan yang menangani dan memilih layanan
        budi.tanganiKendaraan(mobil1);
        budi.tambahkanLayananUntukKendaraan(mobil1, gantiOli);
        budi.tambahkanLayananUntukKendaraan(mobil1, tuneUp);
 
        andi.tanganiKendaraan(motor1);
        andi.tambahkanLayananUntukKendaraan(motor1, servisRem);
 
        budi.tanganiKendaraan(mobil2);
        budi.tambahkanLayananUntukKendaraan(mobil2, gantiBan);
 
        andi.tanganiKendaraan(motor2);
        andi.tambahkanLayananUntukKendaraan(motor2, gantiOli);
        andi.tambahkanLayananUntukKendaraan(motor2, servisRem);
 
        // 7. Menampilkan semua informasi
        Pelanggan[] semuaPelanggan = { pelanggan1, pelanggan2 };
 
        for (Pelanggan pelanggan : semuaPelanggan) {
            System.out.println();
            System.out.println("Nama Pelanggan : " + pelanggan.getNama());
            System.out.println("No. Telepon    : " + pelanggan.getNomorTelepon());
            System.out.println("-----------------------------------------------------");
 
            for (Kendaraan kendaraan : pelanggan.getDaftarKendaraan()) {
                System.out.println("Kendaraan : " + kendaraan.getInfoKendaraan());
 
                Karyawan mekanik = kendaraan.getMekanikPenanggungJawab();
                if (mekanik != null) {
                    System.out.println("Ditangani oleh : " + mekanik.getNama() + " (" + mekanik.getPosisi() + ")");
                }
 
                System.out.println("Layanan dipilih :");
                for (Layanan layanan : kendaraan.getLayananDipilih()) {
                    System.out.println("   - " + layanan.getServiceName() + " : Rp" + layanan.getServicePrice());
                }
                System.out.println("Biaya layanan dasar (" + kendaraan.getTipeKendaraan() + ") : Rp"
                        + kendaraan.getBiayaLayananDasar());
                System.out.println("Total Perkiraan Biaya : Rp" + kendaraan.hitungTotalBiaya());
                System.out.println();
            }
            System.out.println("-----------------------------------------------------");
        }
    }
}
