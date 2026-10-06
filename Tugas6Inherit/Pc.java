package Tugas6Inherit;
public class Pc extends Game{
    private boolean mouse;
    private boolean tombolKiri;
    private boolean tombolKanan;
    private boolean scrollWheel;

    public Pc(){
        super(null, null, 0.0);
        this.mouse = false;
    }

    public Pc(String judul, String genre, double size, boolean mouse){
        super(judul, genre, size);
        this.mouse = mouse;
    }

    public boolean getMouse(){
        return mouse;
    }
 
    public void nyalakanMouse(){
        mouse = true;
        System.out.println("Mouse dinyalakan");
    }

    public void matikanMouse(){
        mouse = false;
        System.out.println("Mouse dimatikan");
    }

    public boolean klikKiri(){
        tombolKiri = true;
        if (mouse==true){
            if (tombolKiri==true){
                System.out.println("Mouse melakukan klik kiri");
            }
        }
        else{
            System.out.println("Mouse tidak terhubung, harap nyalakan mouse");
        }
        return tombolKiri;
    }

    public boolean klikKanan(){
        tombolKanan = true;
        if (mouse==true){
            if (tombolKanan==true){
                System.out.println("Mouse melakukan klik kanan");
            }
        }
        else{
            System.out.println("Mouse tidak terhubung, harap nyalakan mouse");
        }
        return tombolKanan;
    }

    public boolean scrollBawah(){
        scrollWheel = true;
        if (mouse==true){
            if (scrollWheel==true){
                System.out.println("Mouse melakukan scroll bawah");
            }
        }
        else{
            System.out.println("Mouse tidak terhubung, harap nyalakan mouse");
        }
        return scrollWheel;
    }
    public boolean scrollAtas(){
        scrollWheel = false;
        if (mouse==true){
            if (scrollWheel==false){
                System.out.println("Mouse melakukan scroll atas");
            }
        }
        else{
            System.out.println("Mouse tidak terhubung, harap nyalakan mouse");
        }
        return scrollWheel;
    }

    public void play(){
        if (mouse==true){
            System.out.println(getJudul() + " sedang dimainkan di PC");
        }
        else{
            System.out.println("Mouse tidak terhubung, harap nyalakan mouse agar dapat bermain");
        }
    }
}
