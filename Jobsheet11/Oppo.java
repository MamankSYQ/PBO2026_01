package Jobsheet11;
public class Oppo extends Smartphone{
    private boolean flashOn;
 
    public Oppo(){
        super("ColorOS", 4);
        this.flashOn = false;
    }
 
    @Override
    public void useFeature(){
        if (!isPowerOn){
            System.out.println("[" + os + "] Tidak bisa memakai fitur, HP masih mati.");
            return;
        }

        flashOn = true;
        if (flashOn){
            System.out.println("[" + os + "] Flash Charge sudah aktif.");
            return;
        }
    }
}
