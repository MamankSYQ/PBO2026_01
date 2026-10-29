package Jobsheet11;
public class Xiaomi extends Smartphone{
    private boolean turboOn;
 
    public Xiaomi(){
        super("HyperOS", 5);
        this.turboOn = false;
    }
 
    @Override
    public void useFeature(){
        if (!isPowerOn){
            System.out.println("[" + os + "] Tidak bisa memakai fitur, HP masih mati.");
            return;
        }

        turboOn = true;
        if (turboOn){
        System.out.println("[" + os + "] Turbo sudah aktif.");
        return;
        }    
    }
}
