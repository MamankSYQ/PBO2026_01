package Uts;
public class Elektronik {
    private int daya;

    Elektronik(int daya){
        this.daya = daya;
    }

    int getDaya(){
        return daya;
    }

    void setDaya(int daya){
        this.daya = daya;
    }

    void colokKabel(){
        System.out.println("Kabel dicolok, daya " + daya + " watt");
    }
}
