package Jobsheet11;
public abstract class Smartphone implements Phone{
    protected String os;
    protected int volume;
    protected int volumeStep;
    protected boolean isPowerOn;
    
    protected Smartphone(String os, int volumeStep){
        this.os = os;
        this.volumeStep = volumeStep;
        this.volume = 30;
        this.isPowerOn = false;
    }

    @Override 
    public void powerOn(){
        if (isPowerOn) {
            System.out.println("[" + os + "] HP sudah menyala.");
        } 
        else {
            isPowerOn = true;
            System.out.println("[" + os + "] HP dinyalakan.");
        }
    }

    @Override
    public void powerOff(){
        if (!isPowerOn){
            System.out.println("[" + os + "] HP sudah mati.");
        } 
        else {
            isPowerOn = false;
            System.out.println("[" + os + "] HP dimatikan.");
        }
    }

    @Override
    public void volumeUp(){
        if (!isPowerOn){
            System.out.println("[" + os + "] HP masih mati, volume tidak bisa diubah.");
            return;
        }
        if (volume >= maxVolume){
            System.out.println("[" + os + "] Volume sudah maksimal : " + maxVolume);
            return;
        }
        volume = Math.min(volume + volumeStep, maxVolume);
        System.out.println("[" + os + "] Volume naik menjadi " + volume);
    }

    @Override
    public void volumeDown(){
        if (!isPowerOn){
            System.out.println("[" + os + "] HP masih mati, volume tidak bisa diubah.");
            return;
        }
        if (volume <= minVolume){
            System.out.println("[" + os + "] Volume sudah minimal : " + minVolume);
            return;
        }
        volume = Math.max(volume - volumeStep, minVolume);
        System.out.println("[" + os + "] Volume turun menjadi " + volume);
    }
 
    public int getVolume() {
        return volume;
    }

    public abstract void useFeature();
}
