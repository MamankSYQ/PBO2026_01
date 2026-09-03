public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "011111";
        m2.nama = "Ahmad";
        m2.alamat = "Malang";
        m2.kelas = "2D";

        m3.nim = "037618";
        m3.nama = "Budi";
        m3.alamat = "Bali";
        m3.kelas = "2G";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
