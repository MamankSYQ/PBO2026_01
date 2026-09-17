package Jobsheet03;
public class Mouse {
    private String merk;
    private String tipe;
    private int ukuran;
    private int bobot;
    private String jenis;
    private int dpiMax;
    private int dpi = 4200;
    private boolean tombolKiri;
    private boolean tombolKanan;
    private boolean scrollWheel;

    public Mouse (String merk, String tipe, int ukuran, int bobot, String jenis, int dpiMax){
        this.merk = merk;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.bobot = bobot;
        this.jenis = jenis;
        this.dpiMax = dpiMax;
    }

    public void info(){
        System.out.println("Merk Mouse                  : "+merk);
        System.out.println("Tipe Mouse                  : "+tipe);
        System.out.println("Ukuran Mouse                : "+ukuran+" cm");
        System.out.println("Bobot                       : "+bobot+" gram");
        System.out.println("Jenis Mouse                 : "+jenis);
        System.out.println("DPI Sekarang                : "+dpi);
        System.out.println("DPI Maksimal                : "+dpiMax);
    }

    public String getMerk(){
        return merk;
    }

    public String getTipe(){
        return tipe;
    }
    
    public int getUkuran(){
        return ukuran;
    }

    public int getBobot(){
        return bobot;
    }

    public String getJenis(){
        return jenis;
    }

    public int getDpi(){
        return dpi;
    }

    public void klikKiri(){
        tombolKiri = true;
        if (tombolKiri==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan klik kiri.");
        }
    }

    public void klikKanan(){
        tombolKanan = true;
        if (tombolKanan==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan klik kanan.");
        }
    }

    public void scrollBawah(){
        scrollWheel = true;
        if (scrollWheel==true){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan scroll bawah.");
        }
    }
    public void scrollAtas(){
        scrollWheel = false;
        if (scrollWheel==false){
            System.out.println("Mouse "+merk+" "+tipe+" melakukan scroll atas.");
        }
    }

    public void ubahDpi(int dpi){
        if (dpi > dpiMax){
            System.out.println("DPI yang dipilih melebihi batas maksimal dpi mouse ini");
        }
        else if (dpi < 0){
            System.out.println("DPI tidak bisa pernilai negatif");
        }
        else{
            this.dpi = dpi;
        }
    }
}
