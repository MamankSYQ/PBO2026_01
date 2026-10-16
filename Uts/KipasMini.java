package Uts;
public class KipasMini extends Kipas{
    private int baterai;

    KipasMini(int daya, int ukuran, int kecepatan, int baterai){
        super(daya, ukuran, kecepatan);
        this.baterai = baterai;
    }

    void setBaterai(int baterai){
        this.baterai = baterai;
    }

    int getBaterai(){
        return baterai;
    }
}
