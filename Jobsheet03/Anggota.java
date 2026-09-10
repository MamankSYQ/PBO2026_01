package Jobsheet03;
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNoKtp(){
        return noKtp;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman){
        if (jumlahPinjaman > limitPinjaman){
            System.out.println("Jumlah peminjaman melebihi limit peminjaman");
        }
        else{
            this.jumlahPinjaman = jumlahPinjaman;
        }
    }

    public void angsur(int jumlahAngsur){
        jumlahPinjaman = jumlahPinjaman - jumlahAngsur;
    }
}
