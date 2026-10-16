package Uts;
public class Kipas extends Elektronik{
    private int ukuran;
    private int kecepatan;

    Kipas(int daya, int ukuran, int kecepatan){
        super(daya);
        this.ukuran = ukuran;
        this.kecepatan = kecepatan;
    }

    int getUkuran(){
        return ukuran;
    }

    void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }

    int getKecepatan(){
        return kecepatan;
    }

    void naikkanKecepatan(){
        kecepatan++;
        System.out.println("Kecepatan naik menjadi " + kecepatan);
    }

    void turunkanKecepatan(){
        if (kecepatan > 0) {
            kecepatan--;
        }
        System.out.println("Kecepatan turun menjadi " + kecepatan);
    }
}
