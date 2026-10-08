package Tugas6Inherit;
public final class Mobile extends Game{
    private boolean touchScreen;
    private String gesture;
    private String versi;

    public Mobile(String judul, String genre, double size, String versi){
        super(judul, genre, size);
        this.versi = versi;
    }

    public boolean getTouchscreen(){
        return touchScreen;
    }

    public String getGesture(){
        return gesture;
    }

    public boolean touch(){
        touchScreen = true;
        if (touchScreen==true){
            System.out.println("Layar disentuh");
        }
        return touchScreen;
    }
 
    public String slideAtas(){
        System.out.println("Layar Slide ke atas");
        return gesture;
    }
 
    public String slideBawah(){
        System.out.println("Layar Slide ke bawah");
        return gesture;
    }
 
    public String slideKanan(){
        System.out.println("Layar Slide ke kanan");
        return gesture;
    }
 
    public boolean slideKiri(){
        System.out.println("Layar Slide ke kiri");
        return true;
    }
    
    public void info(){
        super.info();
        System.out.println("Versi : "+versi);
    }

    @Override
    public void play(){
        System.out.println(getJudul()+" sedang dimainkan di mobile");
    }
}
