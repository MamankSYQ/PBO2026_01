public class Mouse {
    public String merk;
    public String tipe;
    public int bobot;
    public String jenis;
    public int dpi;
    public boolean tombolKiri;
    public boolean tombolKanan;
    public boolean scrollWheel;

    public void info(){
        System.out.println("Merk Mouse                  : "+merk);
        System.out.println("Tipe Mouse                  : "+tipe);
        System.out.println("Bobot                       : "+bobot+" gram");
        System.out.println("Jenis Mouse                 : "+jenis);
        System.out.println("DPI Maksimal                : "+dpi);
    }

    public boolean klikKiri(){
        tombolKiri = true;
        if (tombolKiri==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan klik kiri.");
        }
        return tombolKiri;
    }

    public boolean klikKanan(){
        tombolKanan = true;
        if (tombolKanan==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan klik kanan.");
        }
        return tombolKanan;
    }

    public boolean scrollBawah(){
        scrollWheel = true;
        if (scrollWheel==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan scroll bawah.");
        }
        return scrollWheel;
    }
    public boolean scrollAtas(){
        scrollWheel = false;
        if (scrollWheel==false){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan scroll atas.");
        }
        return scrollWheel;
    }
}
