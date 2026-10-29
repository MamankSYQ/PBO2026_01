package Jobsheet11;
public class PenggunaTelepon {
    private Phone phone;
 
    public PenggunaTelepon(Phone phone){
        this.phone = phone;
    }
 
    public void turnOnThePhone(){
        phone.powerOn();
    }
 
    public void turnOffThePhone(){
        phone.powerOff();
    }
 
    public void makePhoneLouder(){
        phone.volumeUp();
    }
 
    public void makePhoneSilent(){
        phone.volumeDown();
    }
}
