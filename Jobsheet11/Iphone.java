package Jobsheet11;
public class Iphone extends Smartphone{
    private boolean faceIdOn;
 
    public Iphone(){
        super("iOS", 10);
        this.faceIdOn = false;
    }
 
    @Override
    public void useFeature(){
        if (!isPowerOn){
            System.out.println("[" + os + "] Tidak bisa memakai fitur, HP masih mati.");
            return;
        }

        faceIdOn = true;
        if (faceIdOn){
            System.out.println("[" + os + "] Face ID sudah aktif.");
            return;
        }
    }
}
