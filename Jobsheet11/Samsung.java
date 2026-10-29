package Jobsheet11;
public class Samsung extends Smartphone{
    private boolean dexActive;
 
    public Samsung(){
        super("One UI", 2);
        this.dexActive = false;
    }
 
    @Override
    public void useFeature(){
        if (!isPowerOn){
            System.out.println("[" + os + "] Tidak bisa memakai fitur, HP masih mati.");
            return;
        }

        dexActive = true;
        if (dexActive){
            System.out.println("[" + os + "] Dex sudah aktif.");
            return;
        }
    }
}
